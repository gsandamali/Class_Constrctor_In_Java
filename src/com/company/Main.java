package com.company;

public class Main {

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println(cube1.getCubeVolume());

        Cube cube2 = new Cube(12,1,6);
        System.out.println(cube2.getCubeVolume());
    }
}
