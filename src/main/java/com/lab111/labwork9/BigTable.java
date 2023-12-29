package com.lab111.labwork9;

/**
 * This class extends AbstractBuilder
 * 
 * @author olegs
 */
public class BigTable extends AbstractBuilder {

	@Override
	public void buildName() {
		this.table.setName("Big Table");
	}

	@Override
	public void buildColumns() {
		this.table.setColumns(50);
	}

	@Override
	public void buildRows() {
		this.table.setRows(50);
	}
}
