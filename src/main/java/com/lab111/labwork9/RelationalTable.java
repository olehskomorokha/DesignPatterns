package com.lab111.labwork9;

/**
 * This class contains data of relation table
 * @author olegs
 */
public class RelationalTable {
	/**
	 * This fielSSd contains name of table
	 */
	private String name;
	/**
	 * This field contains amount of table columns
	 */
	private int columns;
	/**
	 * This field contains amount of table rows
	 */
	private int rows;

	/**
	 * @param name
	 * assigned with the field name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param c
	 * assigned with the field columns
	 */
	public void setColumns(int c) {
		this.columns = c;
	}

	/**
	 * @param r
	 * assigned with the field rows
	 */
	public void setRows(int r) {
		this.rows = r;
	}

	/**
	 * This method draws a table
	 */
	public void drawTable() {
		System.out.println(this.name + ": columns = " + this.columns
		+ ", rows = " + this.rows);

	}
}

