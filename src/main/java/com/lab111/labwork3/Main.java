package com.lab111.labwork3;
/**
 * The Main class is the entry point of the application.
 * @author oleg
 */

public class Main {
	public static void main(String[] args){
		
        //Create our 4 figures for manipulations.
        Figure figure1 = new Figure(5,3,1,2);
        Figure figure2 = new Figure(2,2,7,1);
        Figure figure3 = new Figure(32,3,9,7);
        Figure figure4 = new Figure(0,0,23,23);


        // Create two CompositeGraphic objects to represent different areas of allocation.
        CompositeGraphic area1 = new CompositeGraphic();
        CompositeGraphic area2 = new CompositeGraphic();

        //Business methods for "Leaf"/single figure. If we check single figure properties.
        System.out.println("figure1:");
        figure1.draw();

        // Modify and display the properties of 'figure3'
        System.out.println("\nfigure3 changed:");
        figure3.changeSize(3);
        figure3.shiftXY(1,-1);
        figure3.draw();

        // we take figures 1,2,3. They are added in our field of the allocated figures.
        area1.add(figure1);
        area1.add(figure2);
        area1.add(figure3);


        // Display the contents of 'area1'.
        System.out.println("\narea1:");
        area1.draw();

        // Modify 'area1' by shifting and resizing it, then display the modified 'area1'.
        System.out.println("\narea1 changed:");
        area1.shiftXY(2,2);
        area1.changeSize(-1);
        area1.draw();

        // Add 'area1' and figure4 to 'area2'.
        System.out.println("\narea2:");
        area2.add(area1);
        area2.add(figure4);
        area2.draw();

        // Remove 'figure4' from 'area2' and display the updated 'area2'.
        System.out.println("\narea2 removed figure4:");
        area2.remove(figure4);
        area2.draw();

    }
}
