package designPattern.creationaldesignPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
List<Item> items=new ArrayList<>();

public void addItem(Item item) {
	items.add(item);
}

public float getCost() {
	Double doubleValue=items.stream().mapToDouble(item->item.price()).sum();
	return  doubleValue.floatValue();
}

public void showItems() {
	items.forEach(item->{
		System.out.println(item.name()+"\t"+item.price()+"\t"+item.packing().pack());
	});
}
}
