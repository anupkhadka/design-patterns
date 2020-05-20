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

#ifndef COMMANDPROCESSOR_H
#define COMMANDPROCESSOR_H

#include "Command.h"
#include <string>
using namespace std;

class CommandProcessor 
{
    public: 
        
        //constructs command processor with empty registry which can
        //hold up to n commands
        CommandProcessor(int n);

        //destructor
        ~CommandProcessor();

        //adds named command to registry
        //command processor will be considered sole owner
        //of the commands
        void addCommand(const string &name, Command *command);

        //adds command to handle bad commands to registry if not
        //done, command processor will simply print an error message
           //stating the command name is invalid
        void badCommand(Command *command);

        //finds and executes named command. Executes bad command
        //if not found. If no bad command, prints error message
         //and returns	
        void execute(const string& name);		

    private: 
        
        //copy constructor and assignment operator not implemented
        CommandProcessor(const CommandProcessor&);
        CommandProcessor& operator = (const CommandProcessor&);

        struct Elem {
            string name;
            Command *command;
        };

        int maxCommands;
        int numCommands;
        Elem *registry;
        Command *badcommand;
};

#endif 
