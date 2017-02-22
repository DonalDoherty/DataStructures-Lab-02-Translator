package utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utils.CSVLoader;
import models.MyMaxHeap;
import models.WordPair;

public class CSVLoaderTest {
	CSVLoader csv;
	MyMaxHeap<WordPair> pairs;
	@Before
	public void setUp(){
		csv = new CSVLoader();
		pairs = csv.loadPairs("Data/pairs.txt");
	}

	//The list before being changed has 94 pairs of words. (This returns 90 for some reason?)
	@Test
	public void testListSize() {
		assertEquals(94, pairs.getSize());
	}
	
	//checks individual entries to make sure data is correct.
	@Test
	public void testIndividualPairs() {
		assertEquals("gracias", pairs.getMax().getSpanish());
		assertEquals("thanks", pairs.getMax().getEnglish());
		pairs.removeMax();
		assertEquals("beber", pairs.getMax().getSpanish());
		assertEquals("to drink", pairs.getMax().getEnglish());

	}

}
