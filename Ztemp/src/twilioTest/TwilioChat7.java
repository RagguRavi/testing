package twilioTest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.chat.v2.service.User;
import com.twilio.rest.chat.v2.service.channel.Member;
import com.twilio.rest.taskrouter.v1.workspace.Activity;
import com.twilio.rest.taskrouter.v1.workspace.Task;
import com.twilio.rest.taskrouter.v1.workspace.Worker;
import com.twilio.rest.taskrouter.v1.workspace.task.Reservation;

import antlr.collections.List;

public class TwilioChat7 {
 public static void main(String[] args) {
	 String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
     String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
     Twilio.init(twilioAccountSid, twilioAuthToken);
     String workSpace = "WS3ccf9a6a6e4b6ea8d8c152645d2f671b";
     String taskId = "WT4fe1cf9c34e903c0c138c4cfc6da5d12";
     
//     User user = User.fetcher("IS6c7e51abf2fa4e8ab0cec8416268ae7b", "USfd0c3e4294cd4083ab48a6e59a4757ba").fetch();
    /* ResourceSet<Reservation> set = Reservation.reader("WS3ccf9a6a6e4b6ea8d8c152645d2f671b", "WT4fe1cf9c34e903c0c138c4cfc6da5d12").read();
     for(Reservation re : set) {
    	 System.out.println(re.getSid()+"\t"+re.getWorkerSid()+"\t"+re.getWorkerName());
    	 Reservation.updater(workSpace, taskId, re.getSid()).setReservationStatus(Reservation.Status.RESCINDED).update();
     }*/
//     Reservation.updater(workSpace, taskId, "WR538115d19af6cd25b47cf723e8f6dfd3").setReservationStatus(Reservation.Status.TIMEOUT).update();
     
    /* ResourceSet<Task> tasks = 
				Task.reader(workSpace)
				.setAssignmentStatus(Arrays.asList("pending"))
				.setEvaluateTaskAttributes("tenantIdentifier == 'ravi1'")
				.setTaskQueueSid("WQdc09034ac58a5c48223be8f5aca00817")
				.read();
     Integer i = new Integer(0);
     System.out.println(tasks);
     
     tasks.forEach(task ->{
    	 System.out.println(task);	
     });*/
     
    /* ResourceSet<Worker> workers = Worker.reader(workSpace)
    		 .setTargetWorkersExpression("tenantIdentifier == 'anil'")
    		 .read();
     workers.forEach(worker ->{
    	 System.out.println(worker.getFriendlyName()+"\t");
//    	 Activity acitvity = Activity.fetcher(workSpace, pathSid)
     });*/
    /* 
     ResourceSet<Task> tasks = Task.reader(workSpace)
    		 .setEvaluateTaskAttributes("tenantIdentifier == 'ravi1' AND task.worker")
    		 .setAssignmentStatus("assigned").read();
     
     tasks.forEach(task ->{
    	 System.out.println(task.getAssignmentStatus()+"\t"+task.getAttributes());
     });*/
     
    /* java.util.List<Integer> abc = Arrays.asList(3,3,4,5,3,6,4);
    Iterator<Integer> it = abc.iterator();
    while(it.hasNext()) {
    	System.out.println(it);
    	it.next();
    }*/
    
    Task task = Task.fetcher(workSpace,"WT523ef36361bc74e4f8d30a26117d9942").fetch();
    
    Worker worker = Worker.fetcher(workSpace, "WKe493053554b2618e397dac8048508cf8").fetch();
    Map<String,String> map = worker.getLinks();
    map.forEach((k,v)->{
    	System.out.println(k+"\t"+v);
    });
    
}
}
