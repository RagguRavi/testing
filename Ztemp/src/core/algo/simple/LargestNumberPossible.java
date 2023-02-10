package core.algo.simple;

public class LargestNumberPossible {
	public static void main(String args[]) {
		System.out.println(findLargest(4,0));
	}
	
	static String findLargest(int N, int S){
        String s = "";
        
        for(int i=0;i<N;i++){
            if(S > 9) {
                S = S-9;
                s += "9";
            } else {
                s += S+"";
                S =0;
            }
        }
        
        return s;
    }
}
