package hibernate.example;

public class Core {

	public static void main(String[] args) {
		printTree(20);
		System.out.println();
		int height=6;
		int width=60;
		boolean flag=true;
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++){
				if((i<2||i>(height-3))||(j<2||j>(width-3)))
			 	System.out.print("*");
				else
					System.out.print(" ");
			
		}
			System.out.println();
		}
	}

	
	public static void printTree(final int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i;j++)
				System.out.print(" ");
			for(int k=0;k<=i*2;k++)
				if((i*2)/2==k)
					System.out.print("|");
				else
				System.out.print("*");
			System.out.println();
		}
		int snum=((num*2)/2)-2;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<snum;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<5;k++){
				if(k==2)
					System.out.print("|");
				else
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
