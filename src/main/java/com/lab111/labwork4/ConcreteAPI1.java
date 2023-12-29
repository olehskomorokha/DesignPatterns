package com.lab111.labwork4;
/**
 * Concrete implementation of drawing a rectangle using API1.
 */
public class ConcreteAPI1 implements API1 {
    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing rectangle using API1 at coordinates: (" + x + ", " + y + "), width: " + width + ", height: " + height);
    }
}