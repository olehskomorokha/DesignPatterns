package com.lab111.labwork3;

/**
 * Class for figure.
 * Realise pattern "Composite"
 * @author oleg
 * 
 */

public class Figure implements Graphic {
	
	/**
     * x/y - size; posX/posY - position of the figure
     */
    private int x, y, posX, posY;

    /**
     * constructor to create an instance of a class
     */
    public Figure(int posX, int posY, int x, int y) {
        this.posX = posX;
        this.posY = posY;
        this.x = x;
        this.y = y;
    }

    @Override
    public void shiftXY(int ptsX, int ptsY) {
        posX += ptsX;
        posY += ptsY;
    }

    @Override
    public void changeSize(double size) {
        x = (int) (x + size);
        y = (int) (y + size);
    }

    /**
     * Prints the figure X/Y position
     */
    @Override
    public void draw() {
        System.out.println("(pos)X: " + posX + " (pos)Y: " + posY + " (size)X: " + x + " (size)Y: " + y + ";");
    }

}
