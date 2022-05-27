package core.algo.HeapDS;

import java.util.Arrays;

public class Test1 {
	public static void main(String args[]) {
		Heap h = new Heap(8);
		h.insert(50);
		h.insert(10);
		h.insert(35);
		h.insert(45);
		h.insert(20);
		h.insert(30);
		h.insert(40);	
		h.insert(60);	
		System.out.println(Arrays.toString(h.arr));
		
		h.delete();
		
		System.out.println(Arrays.toString(h.arr));
		
		int arr[] = {10,30,50,20,35,15};
//		heapify(arr, 0, arr.length);
		
	}	
	
	public static void swap(int arr[],int from,int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
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
	
	public void delete() {
		
		//Getting last element and replace it with the top
		arr[1] = arr[maxSize];
		arr[maxSize] = 000;
		
		int currentIndex = 1;
		
		while(currentIndex<maxSize) {
			
			if((2*currentIndex) > maxSize || (2*currentIndex+1) > maxSize) {
				break;
			}
			
			
			int leftVal = arr[2*currentIndex];
			int right = arr[2*currentIndex+1];
			int larger = leftVal > right ? 2*currentIndex : (2*currentIndex)+1;
		 
			
			if(arr[larger] > arr[currentIndex]) {
				swap(larger,currentIndex);
				currentIndex = larger;
			} else {
				return;
			}
			
			
		}
	}
	
}
