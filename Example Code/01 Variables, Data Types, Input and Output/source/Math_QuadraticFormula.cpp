#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    float a, b, c;
    cout << "QUADRATIC FORMULA" << endl;
    
    cout << "Format: ax^2 + bx + c" << endl;
    cout << "Enter a, b, and c: ";
    cin >> a >> b >> c;
    
    float x1, x2;
    
    x1 = ( -b + sqrt( b*b - 4*a*c ) ) / 2 * a;
    x2 = ( -b - sqrt( b*b - 4*a*c ) ) / 2 * a;
    
    cout << "x1 = " << x1 << ", x2 = " << x2 << endl;
    
    return 0;
}
