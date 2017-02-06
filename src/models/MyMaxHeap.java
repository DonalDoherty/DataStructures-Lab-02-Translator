package models;

import java.util.*;

public class MyMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

	private ArrayList<T> content;
	
	public MyMaxHeap()
	{
		content = new ArrayList<T>();
	}
	//adds entry to bottom of heap
	@Override
	public void add(T newEntry) {
		content.add(newEntry);
	}
	//replaces the contents of the first index of the array with the contents of the last index, then deletes the last index
	@Override
	public T removeMax() {
		if(isEmpty() == false)
		{
		Collections.swap(content, 0, content.size()-1);
		T max = content.get(content.size() -1);
		content.remove(content.size()-1);
		return max;
		}
		return null;
	}
	
	//returns the first entry on the heap, the max
	@Override
	public T getMax() {
		if(isEmpty() == false)
		{
			return content.get(0);
		}
		return null;
	}

	//Checks if heap is empty and provides true/false
	@Override
	public boolean isEmpty() {
		if(content.size() <= 0)
			return true;
		return false;
	}

	//returns how many entries are in the heap
	@Override
	public int getSize() {
		if(isEmpty() == false)
			return content.size();
		return 0;
	}

	@Override
	public void clear() {
		content.clear();
	}
	
	//siftUp method
	public void siftUp() {
		int k = content.size() -1;
		while (k > 0) {
			int p = (k-1)/2;
			T item = content.get(k);
			T parent = content.get(p);
			
			if (item.compareTo(parent) > 0){
				//Swapping the content
				Collections.swap(content, k, p);
				//moving up a level
				k=p;
			} else {
				break;
			}
		}
	}
	
	//siftDown method
	public void siftDown() {
		int k = 0;
		int l = 2*k+1;
		while(l < content.size()){
			int max = l, r=l+1;
			if(r < content.size()){
				if(content.get(r).compareTo(content.get(l)) > 0){
					max++;
				}
			}
			if(content.get(k).compareTo(content.get(max)) < 0) {
				Collections.swap(content, max, k);
				k = max;
				l = 2*k+1;
			} else{
				break;
			}
		}
	}
	

}
