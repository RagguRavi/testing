package core.algo.bitManupulation;

public class TwoUniqueNoFromTwiceElements {
	// This function sets the values of *x and *y to non-repeating elements in an array arr[] of size n
    public static void UniqueNumbers2(int[] arr, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum ^ arr[i]);
        }
 
        // Bitwise & the sum with it's 2's Complement will give us the sum containing only the rightmost set bit
        sum = (sum & -sum);
 
        System.out.println(sum);
        // sum1 and sum2 will contains 2 unique
        // elements initialized with 0 box
        // number xored with 0 is number itself
        int sum1 = 0;
        int sum2 = 0;
 
        // traversing the array again
        for (int i = 0; i < arr.length; i++) {
  
            if ((arr[i] & sum) > 0) {
 
                // if result > 0 then arr[i] xored
                // with the sum1
                sum1 = (sum1 ^ arr[i]);
            }
            else {
                // if result == 0 then arr[i]
                // xored with sum2
                sum2 = (sum2 ^ arr[i]);
            }
        }
 
        // print the the two unique numbers
        System.out.println("The non-repeating elements are "
                           + sum1 + " and " + sum2);
    }
 
    public static void main(String[] args)
    {
        int[] arr = new int[] {24,19, 11, 15, 17,  11, 15,  17 };
        int n = arr.length;
        UniqueNumbers2(arr, n);
    }
}
