package com.lab111.labwork9;

/**
 * Main class
 * @author olegs
 */
public class Main {

	public static void main(String[] args) {
		BuilderTable builder = new BuilderTable();
		builder.setBuilder(new BigTable());
		builder.constructTable();
		RelationalTable bigTable = builder.getTable();
		bigTable.drawTable();
		builder.setBuilder(new MediumTable());
		builder.constructTable();
		RelationalTable mediumTable = builder.getTable();
		mediumTable.drawTable();
	}

}
