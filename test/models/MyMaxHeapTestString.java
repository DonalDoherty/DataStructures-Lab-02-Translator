package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyMaxHeapTestString {
	MyMaxHeap<String> heap;
	
	@Before
	public void setUp(){
		heap = new MyMaxHeap<String>();
	}

	@Test
	public void testAdd() {
		String a = "Alpha";
		String b = "Bravo";
		heap.add(b);
		assertEquals(heap.getSize(), 1);
		heap.add(a);
		assertEquals(heap.getSize(), 2);
	}
	
	
	@Test
	public void testGetMax() {
		String c = "Charlie";
		String d = "Delta";
		String f = "Foxtrot";
		heap.add(d);
		heap.add(f);
		heap.add(c);
		assertEquals(heap.getMax(), "Foxtrot");
		}
	
	@Test
	public void testRemoveMax() {
		String c = "Charlie";
		String d = "Delta";
		String f = "Foxtrot";
		heap.add(d);
		heap.add(f);
		heap.add(c);
		heap.removeMax();
		assertEquals(heap.getMax(), "Delta");
		assertEquals(heap.getSize(), 2);
		heap.removeMax();
		assertEquals(heap.getMax(), "Charlie");
		assertEquals(heap.getSize(), 1);
	}
	
	@Test
	public void testIsEmpty() {
		String a = "Alpha";
		assertTrue(heap.isEmpty());
		heap.add(a);
		assertFalse(heap.isEmpty());
	}
	
}
