package com.lab111.labwork3;
import java.util.ArrayList;
import java.util.List;
/**
 * Class for group of objects.
 * Realise pattern "Composite". Its a composite part.
 *
 * @author oleg
 */

public class CompositeGraphic implements Graphic {
	/**
     * Collection of child graphics.
     * @author oleg
     */
    private List<Graphic> selectedFigures = new ArrayList<Graphic>();

    @Override
    public void shiftXY(int ptsX, int ptsY) {
        for (Graphic graphic : selectedFigures) {
            graphic.shiftXY(ptsX, ptsY);
        }
    }

    @Override
    public void changeSize(double size) {
        for (Graphic graphic : selectedFigures) {
            graphic.changeSize(size);
        }
    }

    @Override
    /**
     * Prints positions of all selected/allocated figures
     */
    public void draw() {
        for (Graphic graphic : selectedFigures) {
            graphic.draw();
        }
    }
    /**
     * Adds the graphic to the composition.
     */
    public void add(Graphic graphic) {
        selectedFigures.add(graphic);
    }

    /**
     * Remove the figure from the composition. This method works,
     * when a certain figure leaves from area that you allocate.
     */
    public void remove(Graphic graphic) {
        selectedFigures.remove(graphic);
    }

}
