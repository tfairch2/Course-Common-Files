#include <iostream>
#include <string>
using namespace std;

int main()
{
	cout << "Will you marry me? " << endl;
	
	string choice;
	cin >> choice;
	
	if ( choice == "yes" )
	{
		cout << ":D" << endl;
	}
	else
	{
		cout << ":(" << endl;
	}
	
	return 0;
}
