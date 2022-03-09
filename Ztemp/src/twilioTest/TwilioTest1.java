package twilioTest;

import java.util.HashMap;
import java.util.Map;

import com.twilio.Twilio;
import com.twilio.rest.chat.v2.Service;
import com.twilio.rest.chat.v2.service.Channel;

public class TwilioTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> configuration = new HashMap<>();
        configuration.put("TWILIO_ACCOUNT_SID", "AC6718409023f7d83d34ae1e9b38b73f76");
        configuration.put("TWILIO_AUTH_TOKEN", "f961f9ada9a79003b92836a52bc28cff");
        configuration.put("TWILIO_ACCOUNT_SID_TEST", "AC0168122c886d336e26b8bfcb86bb8734");
        configuration.put("TWILIO_AUTH_TOKEN_TEST", "0030fc6c5fbdf9a44d975c8b50e94b69");
        configuration.put("TWILIO_API_KEY", "SKf775507bf5bca48dd28621ee34e0af0f");
        configuration.put("TWILIO_API_SECRET", "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7");
        configuration.put("TWILIO_NOTIFICATION_SERVICE_SID", "IS5135ecc78064425aa6e12500231a48cd");
        
        String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
        String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
        String twilioApiKey = "SKf775507bf5bca48dd28621ee34e0af0f";
        String twilioApiSecret = "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7";
        String serviceSid = "IS5135ecc78064425aa6e12500231a48cd";
        String channelId = "CHa142e5c9bc264073a47ace67b0ce8269";
        
        Twilio.init(twilioAccountSid, twilioAuthToken);
        
       Service service = Service.fetcher(serviceSid).fetch();
       
       Channel channel = Channel.updater("IS939f8bbb160e4b15b08fd530d1efaf82", "CHe1df96455e574d82953e589a71998506").setAttributes(" \"Hello\": \"everyone\"").update();
       
       System.out.println(channel.getAttributes());
     /*  Service service1 = Service.updater(serviceSid)
               .setFriendlyName("NEW_FRIENDLY_NAME").update();
       
        System.out.println(service.getFriendlyName()+"\t"+service.getPreWebhookUrl()+"\t"+service.getTypingIndicatorTimeout());
       
        ResourceSet<User> users = 
                User.reader(serviceSid)
                .read();

            for(User record : users) {
                System.out.println(record.getSid()+"\t"+record.getFriendlyName()+"\t"+record.getIdentity());
            }
            System.out.println("====================Credential Resource =======================");
            ResourceSet<Credential> credentials = Credential.reader().read();

            for(Credential record : credentials) {
                System.out.println(record.getSid());
            }
            
            
            System.out.println("==================== Channel List =======================");
            ResourceSet<Channel> channels = 
                    Channel.reader(serviceSid)
                    .read();

                for(Channel record : channels) {
                    System.out.println(record.getSid());
                    Channel.deleter(serviceSid,record.getSid()).delete();
                }
            
            System.out.println("====================Reading messages =======================");
            ResourceSet<Message> messages = Message.reader(
            		serviceSid,
            		channelId)
                .read();

            for(Message record : messages) {
                System.out.println(record.getSid()+"\t"+record.getFrom()+"\t"+record.getBody());
                
            }*/
//       CH2b807315a1e448e9b65bceae066116aa
//       Channel.deleter("IS68b5ef95bd9f4a60affa0f035fcef092", "CH2b807315a1e448e9b65bceae066116aa").delete();
	}
	
	void testCodeChat() {
		
		/* Builder b = new TwilioRestClient.Builder(twilioAccountSid, twilioAuthToken);
	        TwilioRestClient trs = b.build();
	        System.out.println(trs.getAccountSid()+"\t");
	        Key key = Key.fetcher(twilioApiKey).fetch();

	        System.out.println(key.getFriendlyName());*/
		 /* Service s2 = Service.fetcher(serviceSid).fetch();
	       System.out.println(s2.getFriendlyName());*/
	      
//      Twilio.init(twilioApiKey, twilioApiSecret, twilioAccountSid);
	       /* ResourceSet<Service> rs = Service.reader().read();
	        rs.forEach(s -> {
	        	 System.out.println(s.getSid()+"\t"+s.getUrl()+"\t"+s.getFriendlyName());
	        	 boolean  result  = Service.deleter(s.getSid()).delete();
	        	 System.out.println(result);
	        });*/
	      /*  Service s = Service.creator().setAclEnabled(true)
	        		.setFriendlyName("From api")
	        		.setWebhookUrl("http:// http://1425fdd8.ngrok.io/BeeperMD/twiliochat")
	        		.setReachabilityWebhooksEnabled(true).create();
	       System.out.println(s.getSid()+"\t"+s.getUrl());*/
	       
        /*String deviceId = "someiosdevice";
        String identity = "user@example.com";
        String appName = "beepermd_chat";
        String endpointId = appName + ":" + identity + ":" + deviceId;

        ChatGrant grant = new ChatGrant();
        grant.setEndpointId(endpointId);
        grant.setServiceSid(serviceSid);

        AccessToken token = new AccessToken.Builder(twilioAccountSid, twilioApiKey, twilioApiSecret)
            .identity(identity).grant(grant).build();

        System.out.println(token.toJwt());*/

	}
	 String generateToken(String identity, String endpointId) {
		   /* IpMessagingGrant grant = new IpMessagingGrant();
		    grant.setEndpointId(endpointId);
		    grant.setServiceSid("IS5135ecc78064425aa6e12500231a48cd");

		    AccessToken token = new AccessToken.Builder(
		      "AC6718409023f7d83d34ae1e9b38b73f76",
		    "SKf775507bf5bca48dd28621ee34e0af0f",
		      "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7"
		    ).identity(identity).grant(grant).build();

		    return token.toJwt();*/
		 return null;
		  }
	 
	 public void intiTwilioChat() {
			Map<String, String> configuration = new HashMap<>();
	        configuration.put("TWILIO_ACCOUNT_SID", "AC6718409023f7d83d34ae1e9b38b73f76");
	        configuration.put("TWILIO_AUTH_TOKEN", "f961f9ada9a79003b92836a52bc28cff");
	        configuration.put("TWILIO_API_KEY", "SKf775507bf5bca48dd28621ee34e0af0f");
	        configuration.put("TWILIO_API_SECRET", "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7");
	        configuration.put("TWILIO_NOTIFICATION_SERVICE_SID", "IS5135ecc78064425aa6e12500231a48cd");
	        
	        String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
	        String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
	        String twilioApiKey = "SKf775507bf5bca48dd28621ee34e0af0f";
	        String twilioApiSecret = "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7";

	        String serviceSid = "IS5135ecc78064425aa6e12500231a48cd";
	        
	        Twilio.init(twilioAccountSid, twilioAuthToken);
	        
	        Service service = Service.updater(serviceSid)
	                .setFriendlyName("NEW_FRIENDLY_NAME").update();

	            System.out.println(service.getFriendlyName());
	        /*String deviceId = "someiosdevice";
	        String identity = "user@example.com";
	        String appName = "beepermd_chat";
	        String endpointId = appName + ":" + identity + ":" + deviceId;

	        ChatGrant grant = new ChatGrant();
	        grant.setEndpointId(endpointId);
	        grant.setServiceSid(serviceSid);

	        AccessToken token = new AccessToken.Builder(twilioAccountSid, twilioApiKey, twilioApiSecret)
	            .identity(identity).grant(grant).build();

	        System.out.println(token.toJwt());*/
		}
		/*<script src="https://media.twiliocdn.com/sdk/js/common/v0.1/twilio-common.min.js"></script>
		<script src="https://media.twiliocdn.com/sdk/js/chat/v0.11/twilio-chat.min.js"></script>
				
*/
}
