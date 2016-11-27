#include <iostream>
using namespace std;

int main()
{
    float width, length;
    cout << "PERIMETER CALCULATOR" << endl;
    
    cout << "Enter width: ";
    cin >> width;
    
    cout << "Enter length: ";
    cin >> length;
    
    float perimeter = 2 * width + 2 * length;
    
    cout << "Perimeter: " << perimeter << endl;    
    
    return 0;
}
