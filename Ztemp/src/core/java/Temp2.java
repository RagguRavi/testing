package core.java;

import java.util.HashSet;
import java.util.Set;

public class Temp2 {
public static void main(String[] args) {
	System.out.println("---------Main Started ---------------");
	Set<SetDemo> set=new HashSet<>();
	SetDemo s1=new SetDemo(1, "first");
	SetDemo s2=new SetDemo(2, "second");
	SetDemo s3=new SetDemo(1, "third");
	
	set.add(s2);
	set.add(s1);
	set.add(s3);
	
	System.out.println(set);
	
}
}

class SetDemo
{
	
	int sid;
	String sname;
	public SetDemo(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "SetDemo [sid=" + sid + ", sname=" + sname + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("***Equals Call**** this"+this+"\tObj :"+obj);
		if(obj instanceof SetDemo)
		{
			SetDemo tempobj=(SetDemo)obj;
			if(tempobj.sid==this.sid)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("##Hascod called### "+this.sid);
		
		return sid;
	}
}