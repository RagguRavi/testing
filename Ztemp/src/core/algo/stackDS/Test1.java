package core.algo.stackDS;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		GfG g= new GfG();
		g.push(1);
		g.push(2);
		g.push(1);
		g.push(3);
		g.push(2);
		g.push(3);
		g.push(1);
		g.push(1);
		g.push(3);
		
		System.out.println(g.pop());
		
		System.out.println(g.getMin());
		
		System.out.println(g.getMin());
		
		

	}

	
	
}

class GfG
{
    int minEle;
    Stack<Integer> s;

    /*returns min element from stack*/
    int getMin() {
    	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop() {
    	if(!s.isEmpty()) {
    		int removingItem = s.pop();
    		
    		if(minEle == removingItem) {
    			minEle = Integer.MAX_VALUE;
    			Enumeration<Integer> e =  s.elements();
//    			Iterator<Integer> it= e.
//    			while(it.hasNext()) {
//    				int temp = it.next();
//    				if(temp < minEle) {
//    					minEle = temp;
//    				}
//    			}
    			
    		} else if(s.isEmpty()) {
    			minEle = -1;
    		}
    		
    		return removingItem;
    	} else {
    		return -1;
    	}
    }

    /*push element x into the stack*/
    void push(int x) {
		if(s == null) {
			s = new Stack<>();
			minEle = x;
		}
		
		if(x < minEle) {
			minEle = x;
		}
		
		s.push(x);
    }	
}
