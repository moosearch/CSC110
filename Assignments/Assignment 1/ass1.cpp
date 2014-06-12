#include <iostream>
#include <string>

void statement();
double pi_approx (int);

void statement()
{
	std::cout << "What is the difference between" << std::endl; std::cout << "a \' and a \\\"?   Or between a \" and a \\\"?" << std::endl << std::endl;
	std::cout << "One is what we see when we're typing out program." << std::endl;
	std::cout << "The other is what appears on the \"console\"." << std::endl;
}

double pi_approx(int num) 
{
	int i = 0;
	double sum = 0.0;
	double denom = 1.0;
	double term = 1.0;
	for (int i; i < num; i++) 
	{
		sum += term*1.0/denom;
		denom += 2.0;
		term *= -1.0;
	}
	return 4.0*sum;
	
}

int main () 
{
	//statement();
	
	std::cout << "LOL";
	
	double pi = pi_approx(100);
	std::cout << "Pi: " << pi << std::endl;
	return 0;
}
