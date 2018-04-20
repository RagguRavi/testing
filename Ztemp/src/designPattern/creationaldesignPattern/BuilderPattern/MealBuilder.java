package designPattern.creationaldesignPattern.BuilderPattern;

public class MealBuilder {
 public Meal vegMeal() {
	 Meal meal=new Meal();
	 meal.addItem(new VegBurger());
	 meal.addItem(new Pepsi());
	 return meal;
 }
 
 public Meal nonVegMeal() {
	 Meal meal=new Meal();
	 meal.addItem(new NonVegBurger());
	 meal.addItem(new Coke());
	 return meal;
 }
}
