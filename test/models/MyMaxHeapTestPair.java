package models;

import org.junit.Before;

import models.WordPair;
import utils.CSVLoader;

public class MyMaxHeapTestPair {

	MyMaxHeap<WordPair> pairs;
	CSVLoader loader;
	
	@Before
	public void setUp(){
		pairs = loader.loadPairs("data/pairs.txt");
	}
	
	
}
