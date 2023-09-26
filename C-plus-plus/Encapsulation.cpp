#include <iostream>
using namespace std;

class Student {
  private:
    // Private attribute
    string name;
    int age;
    string id;

  public:
    // Setter method
    void setName(string n) {
      name = n;
    }
    void setAge(int a) {
      age = a;
    }
    void setID(string i){
        id=i;
    }

    // Getter method
    string getName(){
        return name;
    }
    int getAge() {
      return age;
    }
    string getID(){
        return id;
    }
};

int main() {
  Student myObj;
  myObj.setName("MR XYZ");
  myObj.setAge(21);
  myObj.setID("20-101");
  cout <<"Student Name: " <<myObj.getName()<<endl;
  cout <<"Student Age: " <<myObj.getAge()<<endl;
  cout<<"Student Id: "<<myObj.getID()<<endl;
  return 0;
}
