package twilioTest;

import java.util.Arrays;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.taskrouter.v1.workspace.Task;

public class TwilioTaskRouter1 {
	static String WORKSPACE_SID = "WS3ccf9a6a6e4b6ea8d8c152645d2f671b";
	public static void main(String[] args) {
		int i = 0;
		String taskId = "WT04b3f2904c41b4ce89e115ce814a37a8";
		 String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
	     String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
	     Twilio.init(twilioAccountSid, twilioAuthToken);
	     
		/*// TODO Auto-generated method stub
		ResourceSet<Task> tasks = 
				Task.reader(WORKSPACE_SID)
				.setAssignmentStatus(Arrays.asList("pending"))
				.setEvaluateTaskAttributes("tenantIdentifier == 'ravi1'")
				.setOrdering("DateCreated:asc")
				.setTaskQueueSid("WQdc09034ac58a5c48223be8f5aca00817")
				.read();


		for(Task record : tasks) {     
			++i;
			System.out.println("addons"+record.getAddons()+"Age.:"+record.getDateCreated()+" position.:"+i+"\t"+record.getSid());   
			if(record.getSid().equals(taskId)) {
				break;
			}
		}*/
	     
	     Task task  = Task.fetcher("WS3ccf9a6a6e4b6ea8d8c152645d2f671b", "WS3ccf9a6a6e4b6ea8d8c152645d2f671b").fetch();
	     System.out.println(task.getAttributes());

	}

}
