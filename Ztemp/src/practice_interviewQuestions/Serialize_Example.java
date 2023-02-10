package practice_interviewQuestions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize_Example {
	public static void main(String args[]) {
		deserialize();
		
	}
	
	public static void serialize() {
		Myclass_1 m = new Myclass_1("Ravi","98949484",34l);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/abc.txt"));
			
			oos.writeObject(m);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void deserialize() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/abc.txt"));
			Object obj = ois.readObject();
			System.out.println(obj);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

class Myclass_1 implements Serializable{
	private static final long serialVersionUID = 143455L;
	String name;
	String phone;
	Long id;
	public Myclass_1(String name, String phone, Long id) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
