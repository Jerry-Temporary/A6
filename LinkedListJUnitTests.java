package assignment6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;


class LinkedListJUnitTests {
	
	MyLinkedList<Integer> list = new MyLinkedList<Integer>();

	//Test add on empty list with addfirst and add
	
	
	@Test
	void BasicAddRemove() {
		list.add(0, 1);
		//System.out.println(list.get(0));
		assertTrue(list.get(0) == 1);
		list.addFirst(2);
		//System.out.println(list.get(0) + " " + list.get(1));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		assertThrows(IndexOutOfBoundsException.class, () ->
		  {
		  list.get(5); 
		  }
		  );
		list.addLast(3);
		//System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		assertTrue(list.get(2) == 3);
		list.remove(1);
		//System.out.println(list.get(0) + " " + list.get(1));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 3);
		list.add(1, 1);
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		assertTrue(list.get(2) == 3);
		//System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		list.removeFirst();
		//System.out.println(list.get(0) + " " + list.get(1));
		assertTrue(list.get(0) == 1);
		assertTrue(list.get(1) == 3);
		list.addFirst(2);
		//System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		assertTrue(list.get(2) == 3);
		list.removeLast();
		//System.out.println(list.get(0) + " " + list.get(1));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		list.addLast(4);
		//System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
		assertTrue(list.get(0) == 2);
		assertTrue(list.get(1) == 1);
		assertTrue(list.get(2) == 4);
	}
	
	@Test
	void sizeTest() {
		list.addFirst(1);
		list.add(1, 2);
		list.addLast(3);
		assertTrue(list.size() == 3);
	}
	
	@Test
	void toArray() {
		list.addFirst(1);
		list.add(1, 2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println((Integer)array[i]);
			assertTrue((Integer)array[i] == (i+1));
		}
	}
	@Test
	void getFirstandgetLast() {
		list.addFirst(1);
		list.add(1, 2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
	
		
		assertTrue(list.getFirst() == 1);
		assertTrue(list.getLast() == 6);
		
	}
	
	@Test
	void indexOfTestAndlastIndexOfTest() {
		list.addFirst(1);
		list.add(1, 3);
		list.add(1, 3);
		list.add(1, 3);
		list.addLast(1);
		
		assertTrue(list.indexOf(1) == 0);
		assertTrue(list.lastIndexOf(3) == 3);
		
	}
	@Test
	void isEmptyTest() {
		assertTrue(list.isEmpty());
		list.addFirst(1);
		list.add(1, 3);
		list.add(1, 3);
		list.add(1, 3);
		list.addLast(1);
		
		assertFalse(list.isEmpty());
		
		
	}
	@Test
	void clearTest() {
		list.addFirst(1);
		list.add(1, 3);
		list.add(1, 3);
		list.add(1, 3);
		list.addLast(1);
		list.clear();
		
		assertThrows(NoSuchElementException.class, () ->
		  {
		  list.getFirst(); 
		  }
		  );
		assertTrue(list.isEmpty());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
