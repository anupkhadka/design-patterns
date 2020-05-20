/* 
 * This hierarchy defines possible commands which may be invoked. 
 * Commands may be constructed and executed. Construction is
 * individualized, based on command. Execution is standardized
 * with a single signature
 */

#ifndef COMMAND_H
#define COMMAND_H

class Command 
{
    public: 
        //destructor
        virtual ~Command() {}

        //pure virtual function abstract
        virtual void execute() = 0;
};

class AddCommand: public Command
{
    public:
        //adds two numbers, and prints sum to stdout
        virtual void execute();
};


class MultiplyCommand: public Command
{
    public: 
        //multiplies two numbers, and prints product to stdout
        virtual void execute();
};

//shuts down the system
class ShutDownCommand: public Command
{	
    public:
        virtual void execute();
};

//badcommand
class BadCommand:public Command
{
    public:
        virtual void execute();
};

#endif
