package com.company;

public class Cube {
    int width;
    int breadth;
    int height;

    public int getCubeVolume(){
        return ((width * breadth * height));
    }

    //create dealt constructor
    // constructor never return values
    Cube(){
        width = 10;
        breadth = 20;
        height = 30;
    }

    //constructor overloading
    Cube(int a, int b, int c){
        width = a;
        breadth = b;
        height = c;
    }
}
