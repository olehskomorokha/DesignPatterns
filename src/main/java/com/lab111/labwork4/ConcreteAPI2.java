package com.lab111.labwork4;
/**
 * Concrete implementation of drawing a rectangle using API2.
 */
public class ConcreteAPI2 implements API2 {
    @Override
    public void drawRect(int x, int y, int width, int height) {
        System.out.println("Drawing rectangle using API2 at coordinates: (" + x + ", " + y + "), width: " + width + ", height: " + height);
    }
}