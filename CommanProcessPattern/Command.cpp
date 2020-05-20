/* 
 * This hierarchy defines possible commands which may be invoked. 
 * Commands may be constructed and executed. Construction is
 * individualized, based on command. Execution is standardized
 * with a single signature
 */

#include "Command.h"
#include <iostream>
using namespace std;

//adds two numbers, and print sum to stdout
void AddCommand::execute()
{
    int a,b,sum;
    cin>>a;
    cin>>b;
    sum = a + b;
    cout<<a<<"+"<<b<<"="<<sum<<endl;
}

//multiplies two numbers, and prints product to stdout
void MultiplyCommand::execute()
{
    int a,b,product;
    cin>>a;
    cin>>b;
    product = a * b;
    cout<<a<<"*"<<b<<"="<<product<<endl;
}

void ShutDownCommand::execute()
{
    cout<<"Shutting down system"<<endl;
}

//executes bad command
void BadCommand::execute()
{
    char ch;
    cerr<<"*** bad command, ignored ***\n";
    while(cin.get(ch) && ch != '\n');
}
