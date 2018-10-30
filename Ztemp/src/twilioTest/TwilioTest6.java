package twilioTest;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.chat.v2.Service;
import com.twilio.rest.chat.v2.service.Role;

public class TwilioTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
		String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
		String serviceSid = "IS68b5ef95bd9f4a60affa0f035fcef092";
		String channelId = "CHaa70605d0cb548d5853681efd3da8ecd";
		String workSpaceId = "WS3ccf9a6a6e4b6ea8d8c152645d2f671b";
		Twilio.init(twilioAccountSid, twilioAuthToken);
		
//		String serviceUserRoleSid = null;
//		String 
		
		/*ResourceSet<Role> roles = 
	            Role.reader(serviceSid)
	            .read();

	        for(Role record : roles) {
	            System.out.println(record.getSid()+"\t"+record.getType()+"\t"+record.getFriendlyName());
	        }*/
	        
	        
		Service service = Service.creator("FRIENDLY_NAME").create();
		
		Service updateService = Service.updater(service.getSid())
									.setReachabilityEnabled(true)
									.setTypingIndicatorTimeout(3)
									.update();

	}

}
