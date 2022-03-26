package core.algo.HeapDS;

import java.util.Arrays;

public class Test1 {
	public static void main(String args[]) {
		Heap h = new Heap(7);
		h.insert(50);
		h.insert(10);
		h.insert(35);
		h.insert(45);
		h.insert(20);
		h.insert(30);
		h.insert(40);	
		System.out.println(Arrays.toString(h.arr));
	}	
}
class Heap {
	int arr[];
	int size;
	int maxSize;	
	public Heap(int size) {
		this.maxSize = size;
		this.size = 0;
		arr = new int[size+1];
		arr[0] = Integer.MAX_VALUE;
	}
	public int parent(int i) {
		return (i)/2;
	}
	public void swap(int from,int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}
	public void insert(int no) {
		//Edge Case
		if(size > maxSize)
			return;
		
		arr[++size] = no;
		
		int current = size;
		 
        while (arr[current] > arr[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
	}
	
}
