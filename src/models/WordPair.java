package models;

public class WordPair implements Comparable<WordPair>{
	
	String spanish;
	String english;
	public WordPair(String spanish, String english){
		this.spanish = spanish;
		this.english = english;
	}
	
	public String getSpanish() {
		return spanish;
	}
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}

	
	public int compareTo(WordPair E) {
		if (this.spanish.compareTo(E.spanish) == -1){
			return 1;
		}
		else if(this.spanish.compareTo(E.spanish) == 1){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Pair [Spanish=" + spanish + ", English=" + english + "]";
	}

	
}
