package designPattern.creationaldesignPattern.PrototypePattern;

public abstract class Shape implements Cloneable{
String id;
String type;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

public abstract void draw();
}
