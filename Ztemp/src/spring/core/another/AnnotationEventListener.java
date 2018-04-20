package spring.core.another;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationEventListener {

	@EventListener(value= {EventClass.class})
	public void annotatedEventListner() {
		System.out.println("this is event listener with @eventlistner");
	}
	
	{
		System.out.println("IIB annoationeventlistner");
	}
}
