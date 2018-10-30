package twilioTest;

import java.io.ByteArrayInputStream;

import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;

public class TwilioTest2 {
	public static void main(String[] args) {
		  String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
	        String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
	        String serviceSid = "IS5135ecc78064425aa6e12500231a48cd";
	        
	       /* String twilioApiKey = "SKf775507bf5bca48dd28621ee34e0af0f";
	        String twilioApiSecret = "0a0Hucf7GDohd7roVmoQuHFJrA3gTJs7";
	        String channelId = "CHa142e5c9bc264073a47ace67b0ce8269";*/
	        
	        Twilio.init(twilioAccountSid, twilioAuthToken);
	        TwilioRestClient twilioRestClient = Twilio.getRestClient();
	        Request request = new Request(HttpMethod.GET, "https://mcs.us1.twilio.com/v1/Services/IS68b5ef95bd9f4a60affa0f035fcef092/Media/ME80844118982cf45372f8d4d16cf77ea1");
	        
	        Response response = twilioRestClient.request(request);
	        ByteArrayInputStream inputStream = (ByteArrayInputStream)response.getStream();
	          	try {
				System.out.println(response.getContent()+"\t");
				int i =0 ;
				while(true) {
				int value = inputStream.read();
				System.out.println((i++)+"\t"+value);
					if(value != -1) {
						
					} 
				}
				
        	} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
	        
	        /*System.out.println(response.getStatusCode()+"\t"+response.getContent());
	         try {
	        	 ObjectMapper objectMapper = new ObjectMapper();
	        	Map<String, String> map = objectMapper.readValue(response.getContent(),new TypeReference<Map<String, String>>(){});
	        	String fileName = "abc.jpg";
	        	 File file = new File("d:/"+fileName);
	        	 if(!file.exists()) {
	        		 System.out.println(file.createNewFile());
	        	 }
	        	 
	        	 OutputStream outputStream = new FileOutputStream(file);
	        	while(true) {
	        		int tempValue = inputStream.read();
	        		System.out.println(tempValue);
	        		if(tempValue == -1) {
	        			break;
	        		} else {
	        			System.out.println(tempValue);
	        			outputStream.write(tempValue);
	        		}

	        	}
	        	outputStream.flush();
	        	outputStream.close();
	        } catch (Exception e) {
				// TODO: handle exception
	        	System.out.println(e);
			}*/
	       /* if(inputStream.available()) {
	        	
	        }*/
//	        twilioRestC
	        /*ResourceSet<Role> roles = 
	                Role.reader(serviceSid)
	                .read();

	            for(Role record : roles) {
	                System.out.println(record.getSid()+"\t"+record.getFriendlyName()+"\t"+record.getType()
	                +"\t"+record.getPermissions()
	                );
	            }*/
//	        String CHANNEL_ADMIN = " RLaf593afe50f24663b34048f40d38021c";
	            /*System.out.println("==================== Channel List =======================");
	            ResourceSet<Channel> channels = 
	                    Channel.reader(serviceSid)
	                    .read();

	                for(Channel record : channels) {
	                    System.out.println(record.getSid());
	                    Channel.deleter(serviceSid,record.getSid()).delete();
	                }*/
	                
	         /* System.out.println("============================ all users ======================");
	          ResourceSet<User> users = 
	                  User.reader(serviceSid)
	                  .read();

	              for(User record : users) {
	                  System.out.println(record.getSid());
	                  User.deleter(
	                          serviceSid,
	                          record.getSid())
	                      .delete();
	              }*/
	           // System.out.println("----------------------- creating role-----------------------");
	            
	            /*Role role = Role.creator(
	            		serviceSid,
	                    "new_role1",
	                    Role.RoleType.DEPLOYMENT,
	                    Promoter.listOfOne("addMember"))
	            	
	                .create();
	            System.out.println("--------------------- Creating USER -----------------");
	            User user = 
	                    User.creator(serviceSid, "Ravi_1")
	                  
	                    .setFriendlyName("Ravi_test1")
	                    .setRoleSid(role.getSid())
	                    .create();*/
	            
	            /*String ch = "CHd4d95c56ec2c4172b8500991a9711b63";
	            
	            Member member = Member.creator(
	                    serviceSid,
	                    ch,
	                    "Ravi_1")
	                .create();
	            System.out.println(member.getRoleSid());*/
	                
	                /*System.out.println("--------------------- Creating USER -----------------");
		            User user = 
		                    User.updater(serviceSid, "US03449cbe995049a7a463dbcdab731073")
		                    .setRoleSid("RLd0a7b26cf8624099a976ca88138ac7cc")
		                    .update();*/
	            
	            /*System.out.println("----------------------- creating channel -----------------");
	            Channel channel = Channel.creator(serviceSid)
	                    .setFriendlyName("MyChannel").create();
	            */
	          //  System.out.println("============================= adding member ===============");
	           /* Member member = Member.creator(
	                    serviceSid,
	                    "CH7b19d99acb664b19b9c83c4633a1a399",
	                    "test4")
	            		.setRoleSid("RL634066cb33994af0b7ff331076f40383")
	                .create();*/
	            
	            /*Member member = Member.updater(serviceSid, "CH7b19d99acb664b19b9c83c4633a1a399", "US27d8343c9bbf48c5804e783972a9dbaa")
	            		.setRoleSid("RL634066cb33994af0b7ff331076f40383")
	            		.update();*/
	        
	        /* System.out.println("--------------------- Creating USER -----------------");
            User user = User.creator(serviceSid, "Ravi_3")
                  
                    .setFriendlyName("Ravi_test1")
                    .setRoleSid("RLf98550add8f945f5bba11bb3d1cd5c5f")
                    .create();*/
//	         User user = User.fetcher("IS5135ecc78064425aa6e12500231a48cd", pathSid)
	            
	           /* ResourceSet<Member> members = Member.reader(serviceSid, "CH7b19d99acb664b19b9c83c4633a1a399")
	            		.read();*/
//	        System.out.println(Channel.deleter(serviceSid,"CHe36ea96e18144edb9d3f2b579fdc1678").delete());
	        
	       /* Message message = Message.fetcher(
	        		"IS68b5ef95bd9f4a60affa0f035fcef092",
	                "CHaa70605d0cb548d5853681efd3da8ecd",
	                "IM8567c16d8b6a47a2a2e099fac158e014")
	            .fetch();
	        
	       Map<String,Object> mediaMap =  message.getMedia();
	       mediaMap.forEach((k,v)->{
	    	   System.out.println(k+"\t"+v);
	       });
	       
	       Object obj = mediaMap.get("sid");
	       System.out.println(obj);
	       Media media = Media.fetcher("AC6718409023f7d83d34ae1e9b38b73f76", "IM8567c16d8b6a47a2a2e099fac158e014", "ME80844118982cf45372f8d4d16cf77ea1").fetch();
	  */    
	       
	       /* Message message = Message.fetcher(
	                "ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
	                "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
	                "IMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
	            .fetch();*/
	       
        	/*Map<String, Object> map = objectMapper.readValue(response.getContent(),new TypeReference<Map<String, Object>>(){});
			map.forEach((k,v) ->{
				System.out.println(k+"\t"+v); 
		
			});*/
	}
}
