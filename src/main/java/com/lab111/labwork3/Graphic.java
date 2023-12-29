package com.lab111.labwork3;
/**
 * Interface for single and group elements.
 * Realise patern "Composite"
 * @author oleg
 */

public interface Graphic {

	/**
     * Prints position X/Y of all selected figure.
     */
    void draw();

    /**
     *  shifts x marks to the right if pts > 0, and to the left if pts < 0;
     */
    void shiftXY(int ptsX, int ptsY);
    /**
     * enlarges or shrinks the shape in both coordinates by a given size
     */
    void changeSize(double size);
}
