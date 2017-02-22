package controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TranslatorTest {
	
	Translator trans;

	@Before
	public void setUp() throws Exception {
		trans = new Translator();
	}

	@Test
	public void testAdd() {
		assertEquals(trans.pairs.getSize(), 90);
		trans.add();
		assertEquals(trans.pairs.getSize(), 91);
	}

}
