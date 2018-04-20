package spring.core.another;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class EventPublisher implements ApplicationEventPublisherAware {

	ApplicationEventPublisher application;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.application=applicationEventPublisher;
		System.out.println("Setapplicationevetnpublisher");
	}

	public void publish() {
		application.publishEvent(new EventClass(""));
	}

}
