#include <iostream>
#include <string>
using namespace std;

int main()
{    
    cout << "Enter a job or role: ";
    string job1;
    cin >> job1;
    
    cout << "Enter another job or role: ";
    string job2;
    cin >> job2;
    
    cout << "Enter an adjective: ";
    string adjective;
    cin >> adjective;
    
    cout << "THE PRINCESS AND THE PEA by Hans Christian Andersen" << endl;
    cout << "Once upon a time there was a " << job1 << " who wanted to marry a " << job2 << "; but she would have to be a " << adjective << " " << job2 << "." << endl;
    cout << "He travelled all over the world to find one, but nowhere could he get what he wanted." << endl;
    cout << "There were " << job2 << "s enough, but it was difficult to find out whether they were " << adjective << " ones." << endl;
    cout << "There was always something about them that was not as it should be." << endl;
    cout << "So he came home again and was sad, for he would have liked very much to have a " << adjective << " " << job2 << ". " << endl;
    
    return 0;
}
