package com.lab111.labwork4;
import java.util.Scanner;
/**
 * The `Main` class demonstrates drawing a rectangle using two different APIs (API1 and API2).
 */

public class Main {
	public static void main(String[] args) {
        API1 api1 = new ConcreteAPI1();
        API2 api2 = new ConcreteAPI2();

        Shape rectangle = new Rectangle(10, 20, 30, 40, api1);
        rectangle.drawRectangle();
        
        Shape rectangle2 = new Rectangle(20, 40, 60, 80, api2);
        rectangle2.drawRect();
    }

}