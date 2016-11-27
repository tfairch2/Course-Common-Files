#include <iostream>
using namespace std;

int main()
{
    cout << "FRACTION MULTIPLIER" << endl;
    
    int num1, denom1, num2, denom2;
    
    // Get user input
    cout << "Enter first fraction numerator and denominator: ";
    cin >> num1 >> denom1;
    
    cout << "Enter second fraction numerator and denominator: ";
    cin >> num2 >> denom2;
    
    // Calculate result
    int prodNum, prodDenom;
    prodNum = num1 * num2;
    prodDenom = denom1 * denom2;
    
    // Print result
    cout << endl;  
    cout << num1 << "/" << denom1 << " x "
        << num2 << "/" << denom2 << " = "
        << prodNum << "/" << prodDenom << endl;
    
    return 0;
}
