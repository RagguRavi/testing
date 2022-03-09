package core.java;

public class Temp6 {

    static int divisibleSumPairs(int totalNumber, int dividedBy, int[] ar) {
        // Complete this function
    	System.out.println("----------"+totalNumber +"\t"+ dividedBy+"-------------");
        int numbers=0;
        int temp=0;
        while(true) {
            if(temp+1 == totalNumber) {
                 break;
            }
            System.out.println(numbers +"\t"+ temp);
            for(int i=temp+1;i < totalNumber;i++) {
                if(((ar[i]+ar[temp])%dividedBy) == 0) {
                    numbers++;
                }
            }
            temp++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int[] ar = new int[]{2 ,8 ,6 ,8, 4};
        
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}