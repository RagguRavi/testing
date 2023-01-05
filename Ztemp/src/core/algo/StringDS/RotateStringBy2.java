package core.algo.StringDS;

public class RotateStringBy2 {
	public static void main(String[] args) {
		String st = "amazon";
//		System.out.println(rotateLeft(st, 2));
		System.out.println(isRotated(st, "onamaz"));
	}
	
	 public static boolean isRotated(String str1, String str2) {
		 int l1 = str1.length();
		 int l2 = str2.length();
		 
		 if(l1 != l2) {
			 return false;
		 } else if(l1 < 2) {
			 return str1.equals(str2);
		 }
		 
		 String leftRotate = rotateLeft(str1, 2);
		 if(str2.equals(leftRotate) || rotateRight(str1, 2).equals(str2)) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	
	
	public static String rotateLeft(String st, int n) {
		String first = st.substring(0, n);
		String last = st.substring(n, st.length());
		
		return last+first;
	}
	
	
	public static String rotateRight(String st, int n) {
		int l = st.length();
		String last = st.substring(l-n, l);
		String first = st.substring(0, l-n);
		
		return last+first;
	}
}
