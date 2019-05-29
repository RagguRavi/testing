package core.java;
import java.util.*;
public class HelloWorld {
	public static void main(String [] args)
	{
		int a[]= {1,2,5,2,3,1,1,2};
		Arrays.sort(a);
		int lengt=a.length;
		int temp[]=new int[lengt];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=0;
		}
		for(int i=0;i<lengt;i++)
		{
			temp[--a[i]]++;
		}
		/*for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]);
		}
		*/
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i]>=1)
			{
				int z=i+1;
				System.out.println(z);
			}
		}
	}

}
