package core.java1;

public class Test14 {

	public static void main(String[] args) {
		int []arr = {43, 32, 89, 23, 65, 71, 16, 37, 20};
		int sum = 100;
		
		for(int i=0;i<arr.length;i++) {
			int firstNo = arr[i];
			
			for(int j=i;j<arr.length;j++) {

				if(i != j) {
					int secondInt = arr[j];

					for(int k=j;k<arr.length;k++) {
						if(k != j && k !=i) {
							int thirdInt = arr[k];

							int sumTemp = firstNo+secondInt+thirdInt;
							if(sumTemp == sum) {
								System.out.println(firstNo+" + " + secondInt+" + "+ thirdInt);
							}
						}

					}
				}
			}
			
		}
	

	}

	
	
}

class MyClass implements I,I2 {

	@Override
	public int sum(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiply(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		I.super.hello();
	}
	
}

interface  I {
	int sum(int i, int j);
	int multiply(int i, int j);
	
	default void hello() {
		
	}
	
	static void a() {
	}
	
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}


interface I2 {
	int sum(int a, int b);
	default void hello() {
		System.out.println("from interface I2");
	}
}