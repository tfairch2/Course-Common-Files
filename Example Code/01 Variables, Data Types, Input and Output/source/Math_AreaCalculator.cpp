#include <iostream>
using namespace std;

int main()
{
    float width, length;
    cout << "AREA CALCULATOR" << endl;
    
    cout << "Enter width: ";
    cin >> width;
    
    cout << "Enter length: ";
    cin >> length;
    
    float area = width * length;
    
    cout << "Area: " << area << endl;    
    
    return 0;
}
