/* AUTHOR : Donal Doherty - 20071040*/

package controllers;

import java.util.Scanner;

import utils.CSVLoader;
import models.WordPair;
import models.MyMaxHeap;

public class Translator {
	private Scanner input;
	public CSVLoader csv;
	public MyMaxHeap<WordPair> pairs;
	
	public Translator()
	{
		input = new Scanner(System.in);
		csv = new CSVLoader();
		pairs = csv.loadPairs("Data/Pairs.txt");
	}

	public static void main(String[] args) 
	{
		Translator app = new Translator();
		app.runMain();
	}
	
	private int mainMenu(){ // Menu
    	System.out.println("---MAIN MENU---");
        System.out.println("Please choose a function");
        System.out.println("-------");
        System.out.println("  1) Add a Pairing to the Heap");    
        System.out.println("  2) Get English Meaning");
        System.out.println("  3) Save the List");
        System.out.println("-------");   
        System.out.println("  0) Exit");
        System.out.print("==> ");
        int option = input.nextInt();
        return option;
    }
	
	private void runMain()
	{
		int option = mainMenu();
		while (option !=0)
		{
			switch (option)
			{
            case 1:     add();
         	          	break;
            case 2:     search();
                       	break;
            case 3:     save();
           				break;
            default:    System.out.println("Invalid option entered: " + option);
                        break;
			}
         option = mainMenu();
		}
	}
	
	public void add()
	{
		System.out.println("Please enter Spanish: ");
		System.out.println("==>:  ");
		String spanish = input.nextLine();
		spanish = input.nextLine();
		System.out.println("Please enter English: ");
		System.out.println("==>:  ");
		String english = input.next();
		WordPair pair = new WordPair(spanish, english);
		pairs.add(pair);
		System.out.println(pair.toString());
	}
	
	private void search()
	{
		System.out.println("Please enter your Spanish search term: ");
		System.out.println("==>:  ");
		String search = input.nextLine();
		search = input.nextLine();
		MyMaxHeap<WordPair> searchHeap = new MyMaxHeap();
		searchHeap = pairs;
		int counter = 0;
		for(int i = 0; searchHeap.isEmpty() == false; i++)
		{
			counter++;
			if(search.equals( searchHeap.getMax().getSpanish()))
			{
				System.out.println(searchHeap.removeMax().getEnglish() + "	It took " + counter + " searches to find your search!");
			}
			else
			{
				searchHeap.removeMax();
			}
			
		}
		System.out.println("There are no matches!");
		
	}
	
	private void save()
	{
		
	}

}
