#include <iostream>
#include <string>
using namespace std;

int main()
{
    // Get new lyrics
    cout << "Enter an activity: ";
    string activity;
    cin >> activity;
    
    cout << "Enter an inter-personal relationship: ";
    string relationship;
    cin >> relationship;
    
    // Just display song lyrics
    cout << "SAFETY " << activity << " - MEN WITHOUT HATS" << endl;
    cout << "We can " << activity << " if we want to."  << endl;
    cout << "We can leave your " << relationship << "s behind."  << endl;
    cout << "'Cuz your " << relationship << "s don't " << activity << ","  << endl;
    cout << "and if they don't " << activity << ","  << endl;
    cout << "well they're no " << relationship << "s of mine."  << endl;
    
    return 0;
}
