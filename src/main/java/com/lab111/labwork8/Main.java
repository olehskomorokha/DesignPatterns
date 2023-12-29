package com.lab111.labwork8;

/**
 * @author olegs
 * @version 8.8
 */
public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		IterSingleton.getIterator().setList();
		IterSingleton.getIterator().getList().add(5);
		IterSingleton.getIterator().getList().add(7);
		IterSingleton.getIterator().getList().add(4);
		IterSingleton.getIterator().getList().add(4);
		IterSingleton.getIterator().setIterator();
		System.out.println("The Iterator traverses the list :");
		while (IterSingleton.getIterator().getIter().hasNext()) {
			System.out.println(IterSingleton.getIterator().getIter().next());
		}
	}
}