package core.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.InitialContext;

public class JMSMain {

	public static void main(String[] args) {
		try {
			InitialContext context=new InitialContext();
			System.out.println(context);
			TopicConnectionFactory tcf=(TopicConnectionFactory)context.lookup("TopicCF");
			System.out.println(tcf);
			TopicConnection tc=tcf.createTopicConnection();
			TopicSession ts=tc.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
			
			Topic topic=(Topic)context.lookup("topic1");
			
			TopicPublisher pub=ts.createPublisher(topic);
			tc.start();
			ts.setMessageListener(new MyListener());
			TextMessage msg=ts.createTextMessage("Bol sache darbar ki Jai..");
			pub.publish(msg);
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

class MyListener implements MessageListener
{

	@Override
	public void onMessage(Message arg0) {
		System.out.println("Hey You recived message  :"+arg0);
		
	}
	
}
