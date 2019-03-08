package com.design.pattern.creational.prototype;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException{

        SowrdMen sowrdMen = new SowrdMen();
        sowrdMen.move(new Point3D(10, 20, 30), 50.25);
        sowrdMen.attack();
        System.out.println("First sowrdmen: " + sowrdMen);

        SowrdMen sowrdMen1 = (SowrdMen) sowrdMen.clone();
        System.out.println("Second sowrdmen: " + sowrdMen1);

    }

}
