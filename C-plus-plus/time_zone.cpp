#include <iostream>  
#include <ctime>  
using namespace std;  
  
int main()  
{  
    time_t now = time(0); // This line for current date and time  
  
    cout << "Number of seconds since January 15,2023 is:: " << now << endl;  
  
    tm* ltm = localtime(&now);  
  
    // This line for  various components of tm structure.  
    cout << "Year:" << 1900 + ltm->tm_year << endl; //This line for the year  
    cout << "Month: " << 1 + ltm->tm_mon << endl; // This line for month number  
    cout << "Day: " << ltm->tm_mday << endl; // This line for the day  
    //This line for time in hour:minute:second  
    cout << "Time: " << 6 + ltm->tm_hour << ":";  
    cout << ltm->tm_min << ":";  // This line for in Bangladesh Time zone 
    cout << ltm->tm_sec << endl;  
}
