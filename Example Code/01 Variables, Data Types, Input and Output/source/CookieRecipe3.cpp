#include <iostream>
using namespace std;

int main()
{
    // Ask user the ratio
    cout << "How many servings do you want to make? (1 for normal, or other value to adjust): ";
    float ratio;
    cin >> ratio;
    
    // Store amount for each
    float cupsOfButter = 1.0;
    float cupsOfWhiteSugar = 1.0;
    float cupsOfBrownSugar = 1.0;
    float cupsOfFlour = 3.0;
    float cupsOfWalnuts = 1.0;
    float cupsOfChocolateChips = 2.0;
    float eggs = 2.0;
    float teaspoonsOfVanilla = 2.0;
    float teaspoonsOfBakingSoda = 1.0;
    float teaspoonsOfWater = 2.0;
    float teaspoonsOfSalt = 0.5;
    
    // Output recipe information 
    cout << "Chocolate Chip Cookies" << endl;
    cout << cupsOfButter * ratio << " cups butter, softened " << endl;
    cout << cupsOfWhiteSugar * ratio << " cups white sugar" << endl;
    cout << cupsOfBrownSugar * ratio << " cups packed brown sugar" << endl;
    cout << eggs * ratio << " eggs" << endl;
    cout << teaspoonsOfVanilla * ratio << " teaspoons vanilla extract" << endl;
    cout << cupsOfFlour * ratio << " cups all-purpose flour" << endl;
    cout << teaspoonsOfBakingSoda * ratio << " teaspoon baking soda" << endl;
    cout << teaspoonsOfWater * ratio << " teaspoons hot water" << endl;
    cout << teaspoonsOfSalt * ratio << " teaspoons salt" << endl;
    cout << cupsOfChocolateChips * ratio << " cups semisweet chocolate chips" << endl;
    cout << cupsOfWalnuts * ratio << " cups chopped walnuts" << endl;
    
    return 0;
}
