package core.algo.StringDS;

public class LocateStrInStr {

	public static void main(String[] args) {
		int i = strstr("ccdeecbdfedcbabfdfaebdaf", "fecfacbccfe");
		System.out.println(i);
	}
	static int strstr(String s, String x) {
		if(s.length() < x.length()) {
			return -1;
		}
		
		int matchIdx =  0;
		char[] charStr = s.toCharArray();
		char[] matchStr = x.toCharArray();
		
		
		for(int i=0;i<s.length();i++) {
			
			
			if(charStr[i] == matchStr[matchIdx]) {
				boolean isMatch = checkIfMatch(charStr, matchStr, i);
				if(isMatch) {
					return i;
				}
			} 
			
		}
		
       return -1;
    }
	
	static boolean checkIfMatch(char[] charStr,char[] matchStr,int idx) {
	
		int nextIdx = idx+matchStr.length;
		
		if(nextIdx > charStr.length) {
			return false;
		}
		
		int matchIdx =  0;
		int startingIdx = -1;
		for(int i=idx;i<nextIdx;i++) {
			
			if(charStr[i] == matchStr[matchIdx]) {
				matchIdx++;

				if(startingIdx == -1) {
					startingIdx = i;
				}
				if(matchIdx  >= matchStr.length) {
					return true;
				}
			} else {
				return false;
			}
		}
		
		return false;
	}
}
