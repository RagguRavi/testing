package designPattern.behavioralDesignPattern.Strategy;

public class MallaradDuck  extends Duck implements Flyable {
	@Override
	public void display() {
		System.out.println("Mallarad Duck display");
	} 
	
	@Override
	public void fly() {
		System.out.println("Mallarad Duck fly");
	}
}
