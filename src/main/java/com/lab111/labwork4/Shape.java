package com.lab111.labwork4;

/**
 * Abstract class representing a graphical object with methods to draw using API1 and API2.
 */
public abstract class Shape {
    protected API1 API1;
    protected API2 API2;

    public Shape(API1 API1) {
        this.API1 = API1;
        
    }
    public Shape(API2 API2) {
    	this.API2 = API2;
    }
    public abstract void drawRectangle();
    
    public abstract void drawRect();
}
