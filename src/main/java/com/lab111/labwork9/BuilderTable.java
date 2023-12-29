package com.lab111.labwork9;

/**
 * The class is created through which a particular object
 * 
 * @author olegs
 */
public class BuilderTable {
	/**
	 * This field contains link of object AbstractBuilder
	 */
	private AbstractBuilder absBuilder;

	/**
	 * @param abs
	 *            assigned with the field absBuilder
	 */
	public void setBuilder(AbstractBuilder abs) {
		this.absBuilder = abs;
	}

	/**
	 * @return link of object RelationTable
	 */
	public RelationalTable getTable() {
		return this.absBuilder.getTable();
	}

	/**
	 * This method constructs the table
	 */
	public void constructTable() {
		absBuilder.setTable();
		absBuilder.buildName();
		absBuilder.buildColumns();
		absBuilder.buildRows();
	}
}
