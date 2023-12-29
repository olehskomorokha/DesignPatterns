package com.lab111.labwork9;
/**
 * This class extends AbstractBuilder
 * 
 * @author olegs
 */
public class MediumTable extends AbstractBuilder {

	@Override
	public void buildName() {
		this.table.setName("Small Table");
	}

	@Override
	public void buildColumns() {
		this.table.setColumns(5);
	}

	@Override
	public void buildRows() {
		this.table.setRows(3);
	}
}
