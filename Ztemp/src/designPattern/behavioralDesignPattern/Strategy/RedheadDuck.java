package designPattern.behavioralDesignPattern.Strategy;

public class RedheadDuck extends Duck implements Flyable{

	@Override
	public void display() {
		System.out.println("Red head duck display");
	}
	
	@Override
	public void fly() {
		System.out.println("Red head flying");
	}
}
