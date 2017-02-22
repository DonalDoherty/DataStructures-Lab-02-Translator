package utils;

import java.io.File;

import models.MyMaxHeap;
import models.WordPair;
public class CSVLoader {
	
	public MyMaxHeap<WordPair> loadPairs(String filename)
	{
		File pairFile = new File(filename);
		In inPairs = new In(pairFile);
		
		String delims = "    ";
		MyMaxHeap<WordPair> pairs = new MyMaxHeap<WordPair>();
		while(!inPairs.isEmpty())
		{
			String pair = inPairs.readLine();
			String[] pairTokens = pair.split(delims);
			if (pairTokens.length == 2)
			{
				String spanish = pairTokens[0];
				String english = pairTokens[1];
				
				pairs.add(new WordPair(spanish, english));
			}
		}
		return pairs;
	}

}
