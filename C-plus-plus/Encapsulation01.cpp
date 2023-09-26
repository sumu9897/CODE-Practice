#include<iostream>
using namespace std;

class Box
{
    // as private so object.height and object.width is inaccessible
    int height, width;
  
    public:
    //setters
    void setHeight(int h){
        height = h;
    }

    void setWidth(int w){
        width = w;
    }

    //getters
    int getHeight(){
        return height;
    }

    int getWidth(){
        return width;
    }
};

int main()
{
    Box box;
    
    // setter methods
    box.setHeight(7);
    box.setWidth(4);

    // getter methods
    cout << "The Height is : " << box.getHeight() << endl;
    cout << "The Width is : " << box.getWidth() << endl;
    
    // box.height or box.width wont work as they are private

    return 0;
}
