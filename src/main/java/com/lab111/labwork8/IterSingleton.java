package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class that provides a single object from a global point of access
 * 
 * @author olegs
 */
public class IterSingleton {
	/**
	 * This field contains ArrayList
	 */
	private ArrayList<?> list;
	/**
	 * This field contains Iterator
	 */
	private Iterator<?> iter;
	/**
	 * This static fields contains IterSingleton
	 */
	private static IterSingleton iterator;

	/**
	 * @return object IterSingleton
	 */
	public static IterSingleton getIterator() {
		if (iterator == null) {
			iterator = new IterSingleton();
		}
		return iterator;
	}

	/**
	 * This method sets value of field list
	 */
	@SuppressWarnings("rawtypes")
	public void setList() {
		this.list = new ArrayList();
	}

	/**
	 * this method sets value of field iter
	 */
	public void setIterator() {
		if (list == null) {
			this.list = new ArrayList();
		}
		this.iter = list.iterator();
	}

	/**
	 * @return value of field list
	 */
	public ArrayList getList() {
		return this.list;
	}

	/**
	 * @return value of field iter
	 */
	public Iterator getIter() {
		return this.iter;
	}
}