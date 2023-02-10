package core.p1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;

import javax.persistence.Transient;

public class Test {
	public static void main(String[] args) {
//		serialize();
//		de_serialize();
		
		Long id = ObjectStreamClass.lookup(User.class).getSerialVersionUID();
		System.out.println(id);
		
	}
	
	public static void de_serialize() {
		try {
			InputStream is = new FileInputStream("G:/abc");
			ObjectInputStream ois = new ObjectInputStream(is);
			Object ob=ois.readObject();
			System.out.println(ob);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void serialize() {
		try {
		User s = new User();
		s.setAddress("aaaaaaaaaa");
		s.setId(1l);
		s.setName("Ravi Kumar");
		
		OutputStream os = new FileOutputStream("G:/abc");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(s);
		oos.flush();
		
		oos.close();
		os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

class User implements Serializable {

//	private static final long serialVersionUID = 2265206223326461836l;
	private Long id;
	private String name;
	private String address;
	private String gender;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
	}
	
	
}
