#include <iostream>
using namespace std;

int main()
{
    float x1, y1, x2, y2;
    cout << "SLOPE CALCULATOR" << endl;
    
    cout << "Enter first coordinate pair x, y: ";
    cin >> x1 >> y1;
    
    cout << "Enter second coordinate pair x, y: ";
    cin >> x2 >> y2;
    
    float slopeNumerator = y2 - y1;
    float slopeDenominator = x2 - x1;
    
    float slope = slopeNumerator / slopeDenominator;
    
    cout << "The slope is: " << slope
        << " or " << slopeNumerator << "/" << slopeDenominator
        << endl;
    
    return 0;
}
