package spring.core.another;

import org.springframework.context.ApplicationEvent;

public class EventClass extends ApplicationEvent {

	public EventClass(Object source) {
		super(source);
		System.out.println("EventClass(Object source) :"+ source);
	}

}
