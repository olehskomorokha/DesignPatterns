package com.lab111.labwork4;
/**
 * Concrete implementation of a rectangle with specific coordinates, width, and height.
 */
public class Rectangle extends Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height, API1 API1) {
    	super(API1);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, int width, int height, API2 API2) {
    	super(API2);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawRectangle() {
        API1.drawRectangle(x, y, width, height);
        
    }
    @Override
    public void drawRect() {
    	API2.drawRect(x, y, width, height);
    }
    
}
