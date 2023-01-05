package functional_programming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

import functional_programming.S1.Ad;

public class StaticClassTest {
	public static void main(String[] args) {
	List<Integer> li = List.of(4,5,6,7,8,3,4,5,6);
	li.stream().flatMap(x -> Stream.of(x,x*x,x*x*x)).forEach(System.out::println);;
	
	System.out.println(m1());
	}
	
	static int m1() {
		try {
			
		}  catch(Exception e) {
			
		} finally {
			m2();
			System.out.println(9);
			
		}
		
		
		return -1;
		 
	}
	
	static int m2() {
		if(1==1) {
			throw new NullPointerException();
			
		}
		return 1;
	}

}

class S1 {
	private String name;
	private String phone;
	
	
	static class Ad {
		private String houseNo;
		private String vpo;
		
		Ad (String houseNo,String vpo) {
			this.houseNo = houseNo;
			this.vpo = vpo;
			
		}
		public String getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
		}
		public String getVpo() {
			return vpo;
		}
		public void setVpo(String vpo) {
			this.vpo = vpo;
		}
		@Override
		public String toString() {
			return "Ad [houseNo=" + houseNo + ", vpo=" + vpo + "]";
		}
		
		
	}
	S1(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "S1 [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
