package core.java1;

public class Test20 {

}


 class SingleTonClass {
	private static SingleTonClass obj;
	
	private SingleTonClass() {}
	
	synchronized  static SingleTonClass getObj() {
		if(obj == null) {
			obj = new SingleTonClass();
		}
		return obj;
	}
}