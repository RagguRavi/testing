package spring.core.another;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class MyEventListener implements ApplicationListener<EventClass>{

	@Override
	public void onApplicationEvent(EventClass event) {
		// TODO Auto-generated method stub
		System.out.println("context is custom event" + event);
	}

	
}
