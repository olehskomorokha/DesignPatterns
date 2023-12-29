package com.lab111.labwork9;

/**
 * This abstract class AbstractBuilder
 * 
 * @author olegs
 */
public abstract class AbstractBuilder {
	/**
	 * This fields contains link of object RelationTable
	 */
	public RelationalTable table;

	/**
	 * This method sets the value of the field table
	 */
	public void setTable() {
		this.table = new RelationalTable();
	}

	/**
	 * @return value of field table
	 */
	public RelationalTable getTable() {
		return this.table;
	}

	/**
	 * Abstract method buildName()
	 */
	public abstract void buildName();

	/**
	 * Abstract method buildColumns()
	 */
	public abstract void buildColumns();

	/**
	 * Abstract method buildRows()
	 */
	public abstract void buildRows();
}

