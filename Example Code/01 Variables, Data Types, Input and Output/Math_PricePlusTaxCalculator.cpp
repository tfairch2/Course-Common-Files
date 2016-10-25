#include <iostream>
using namespace std;

int main()
{
    float price, tax;
    cout << "PRICE PLUS TAX CALCULATOR" << endl;
    
    cout << "Enter price: ";
    cin >> price;
    
    cout << "Enter tax: ";
    cin >> tax;
    
    float pricePlusTax = price + price * tax;
    
    cout << "Price plus tax: " << pricePlusTax << endl;    
    
    return 0;
}
