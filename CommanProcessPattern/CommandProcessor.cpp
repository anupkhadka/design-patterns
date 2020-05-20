/*
 * This class provides a general command processing mechanism. 
 * Commands, along with their application oriented command names,
 * may be added to the command processor. A special illegal command
 * may be added that processes bad commands (any command not in the
 * registry). The processor then may be asked to execute commands, 
 * based on their name. If a command is not found in the registry, 
 * an error message is printed and an "illegal command" command is
 * executed
 */

#include "CommandProcessor.h"
#include <iostream>
using namespace std;

//constructs command processor with empty registry which can
//hold up to n commands
CommandProcessor::CommandProcessor(int n)
{
    this->maxCommands = n;
    this->registry = new Elem[n];
    this->numCommands = 0;
    this->badcommand = NULL;
}

//destructor
CommandProcessor::~CommandProcessor()
{
    int i; 
    for(i = 0; i < numCommands; i++) {
        delete registry[i].command;
    }
    delete []registry;
    delete badcommand;
}

//adds named command to registry
//command processor will be considered the sole owner 
//of the commands
void CommandProcessor::addCommand(const string &name, Command *command)
{
    if(numCommands == maxCommands) {
        cerr<<"too many commands - aborting\n";
        exit(1);
    }
    registry[numCommands].name = name;
    registry[numCommands].command = command;

    numCommands++;
}

//adds command to handle bad commands to registry if not
//done, command processor will simply print an error message
//stating the command name is invalid
void CommandProcessor::badCommand(Command *command)
{
    this->badcommand = command;
}

//finds and executes named command. Executes bad command
//if not found. If no bad command, prints error message
//and returns	
void CommandProcessor::execute(const string& name)
{
    int i; 
    for(i = 0; i < numCommands && registry[i].name != name; i++);
    
    if(i < numCommands) {
        registry[i].command->execute();
    } else if(badcommand != NULL) {
        badcommand->execute();
    } else {
        cerr<<"bad command ["<<name<<"]\n";
    }	
}	
