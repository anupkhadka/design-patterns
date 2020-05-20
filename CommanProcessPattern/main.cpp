/*
 * This program initializes CommandProcessor and executes commands
 */

#include "CommandProcessor.h"
#include <iostream>
using namespace std;

const int numCommands = 10;

int main(int argc, char *argv[])
{
    CommandProcessor cp(numCommands);
    string command;
    
    cp.addCommand("add", new AddCommand());
    cp.addCommand("multiply", new MultiplyCommand());
    cp.addCommand("shutdown", new ShutDownCommand());
    cp.badCommand(new BadCommand());

    cout<<"\nenter commands, terminate with shutdown\n\n"; 
    do {
        cout<<"?> ";
        cin>>command;
        cp.execute(command);
    } while(command != "shutdown");
}
