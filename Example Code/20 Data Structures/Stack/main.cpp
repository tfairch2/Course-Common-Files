#include <iostream>
#include <string>
using namespace std;

#include "Stack.hpp"

int main()
{
    Stack<int> numStack;

    cout << endl << "PUSH" << endl;
    for ( int i = 0; i < 5; i++ )
    {
        numStack.Push( i * 3 );
    }

    cout << endl << "POP" << endl;
    while ( numStack.Size() != 0 )
    {
        numStack.Pop();
    }

    return 0;
}
