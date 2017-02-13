package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyMaxHeapTest {
	MyMaxHeap<String> heap;
	
	@Before
	public void setUp(){
		heap = new MyMaxHeap<String>();
		String a = "Alpha";
		String b = "Bravo";
		String c = "Charlie";
		String d = "Delta";
		String e = "Echo";
		String f = "Foxtrot";
		String g = "Golf";
		String h = "Hotel";
		String i = "India";
		String j = "Juliett";
		String k = "Kilo";
		String l = "Lima";
		String m = "Mike";
		String n = "November";
		String o = "Oscar";
		String p = "Papa";
		String q = "Quebec";
		String r = "Romeo";
		String s = "Sierra";
		String t = "Tango";
		String u = "Uniform";
		String v = "Victor";
		String w = "Whiskey";
		String x = "Xray";
		String y = "Yankee";
		String z = "Zulu";

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
}
