package core.java1;

public class Test16 {
	public static void main(String args[]) {
		Sum sum = new Sum() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		System.out.println(sum.sum(2, 4));
	}
}


interface Sum {
	int sum(int a, int b);
}