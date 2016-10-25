#include <iostream>
using namespace std;

int main()
{
	cout << "What is your account balance? ";
	
	float balance;
	cin >> balance;
	
	if ( balance < 0 )
	{
		cout << "You are overdrawn!" << endl;
	}
	
	return 0;
}
