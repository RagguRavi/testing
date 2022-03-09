package twilioTest;

import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.workspace.WorkspaceStatistics;

public class TwilioChat5 {
	public static void main(String[] args) {
		String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
		String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
		String serviceSid = "IS68b5ef95bd9f4a60affa0f035fcef092";
		String channelId = "CHaa70605d0cb548d5853681efd3da8ecd";
		String workSpaceId = "WS3ccf9a6a6e4b6ea8d8c152645d2f671b";
		Twilio.init(twilioAccountSid, twilioAuthToken);
		/*ResourceSet<User> users = 
                User.reader(serviceSid)
                .read();

            for(User record : users) {
                System.out.println(record.getIdentity()+"\t"+record.getIsOnline());
                User temp = User.fetcher(serviceSid,record.getSid()).fetch();
                System.out.println("============"+temp.getIsOnline()+"==============");
            }*/

		/*ResourceSet<Member> members = Member.reader(serviceSid, channelId)
				.read();
		String tempChannelId = channelId;

		members.forEach(member ->{
			Member.deleter(serviceSid, tempChannelId, member.getSid()).delete();
			System.out.println(member.getIdentity()+"\t");
		});*/

		/*ResourceSet<Workspace> workspaces = Workspace.reader().read();

		for(Workspace record : workspaces) {
			System.out.println(record.getSid()+"\t"+record.getFriendlyName());
		}*/

		/* Worker worker = Worker.creator(
	                workSpaceId,"Support Worker 1")
	            .setAttributes("{\"type\":\"support\"}").create();

	        System.out.println(worker.getActivityName()+"\t"+worker.getAvailable()+"\t");*/
		/*String workerId = "WK5d05c03a121105475f1329df9e240c3b";
		WorkerReader workers = Worker.reader(workSpaceId);
		ResourceSet<Worker> set = workers.read();
		set.forEach(worker -> {
			worker.updater(workSpaceId, worker.getSid()).setActivitySid("WAe3ff85e9982a8b7d22a1eb1893565f13").update();
			System.out.println(Worker.deleter(workSpaceId, worker.getSid()).delete());
			worker.deleter(workSpaceId, worker.getSid()).delete();
		});*/
		/*Worker worker = Worker.fetcher(workSpaceId, workerId).fetch();

		System.out.println(worker.getActivityName()+"\t"+worker.getAvailable());

		ResourceSet<Activity> activities = Activity.reader(workSpaceId).read();
		for(Activity record : activities) {
			System.out.println(record.getSid()+"\t"+record.getFriendlyName()+"\t"+record.getAvailable()+'\t'+record.getUrl());
		}

		System.out.println("=========================== Events ================================");

		ResourceSet<Event> events = 
				Event.reader(workSpaceId)
				.read();

		for(Event record : events) {
			System.out.println(record.getSid()+"\t"+record.getActorType()+"\t"+record.getDescription()+"\t"+record.getSource()+"\t"+record.getActorUrl());
		}

		System.out.println("=========================== Tasks Channel ================================");
		ResourceSet<TaskChannel> channels = TaskChannel.reader(workSpaceId).read();

		for (TaskChannel channel : channels) {
			System.out.println(channel.getUniqueName());
		}*/

		/*System.out.println("=========================== Tasks ================================");

		ResourceSet<Task> tasks = 
				Task.reader(workSpaceId)
				.read();

		for(Task record : tasks) {
			System.out.println(record.getSid()+"\t"+record.getAttributes()+"\t"+record.getTaskChannelUniqueName()+"\t"+record.getTaskQueueFriendlyName()+"\t"
					+record.getWorkflowFriendlyName()+"\t"
					);
			System.out.println(Task.deleter(workSpaceId, record.getSid()).delete());
		}

		System.out.println("=========================== Tasks Queue ================================");
*///		TaskQueue taskQueue = TaskQueue.
//		Task.updater(workSpaceId, workerId).set
		
		 /*Task task = Task.updater(
	                workSpaceId,
	                "WT714cb4acb9f93165d220dcbf60171b90")
	            .setAssignmentStatus(Task.Status.COMPLETED)
	            .setReason("waiting too long")
	            .update();*/
		
		/*ResourceSet<WorkerChannel> wc = WorkerChannel.reader(workSpaceId, workerId).read();
		wc.forEach(channel ->{
			System.out.println(channel.getTaskChannelUniqueName()+"\t"+channel.getConfiguredCapacity()+"\t"+channel.getAvailable());
		});*/
		
		/*Worker worker = Worker.updater(workSpaceId, "WKf2506d10c1892227ca550addbf4db37c")
				.setFriendlyName("Nitin").update();*/
		/*
		 TaskQueue taskQueue = TaskQueue.fetcher(
	                workSpaceId,
	                "WQdc09034ac58a5c48223be8f5aca00817").fetch();
		 
		 System.out.println(taskQueue.getTargetWorkers());
		 System.out.println(taskQueue.getTaskOrder());
		 System.out.println(taskQueue);*/
		
		WorkspaceStatistics workspaceStatistics = WorkspaceStatistics.fetcher(
                workSpaceId
                )
            .fetch();

        System.out.println(workspaceStatistics.getRealtime());
	   
		
	}
}
