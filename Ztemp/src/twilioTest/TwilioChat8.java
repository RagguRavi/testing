package twilioTest;

public class TwilioChat8 {
	public static void main(String[] args) {
		
		IntializeTwilio.initializeTwilio();
		String WORKSPACE_SID = "WSc16fe4ca3d95a614c3ea243c1b8201d3";
		/*	ResourceSet<Worker> workers = 
				Worker.reader(WORKSPACE_SID)
				.setTargetWorkersExpression("tenantIdentifier == 'roni'")
				.read();
		
		workers.forEach(worker->{	
			System.out.println(worker.getAttributes()+"\t"+worker.getAvailable());
//			System.out.println(worker.getc);
		});*/
	     
//	    User user =  User.fetcher("IS939f8bbb160e4b15b08fd530d1efaf82", "ravites18").fetch();
//	    System.out.println(user.);
	    
	    /*System.out.println(User.deleter("IS939f8bbb160e4b15b08fd530d1efaf82", "ravites18").delete());
//	     User.
 */
//		User.deleter("IS939f8bbb160e4b15b08fd530d1efaf82", "USb7ebccc0a20542399cf76663331f4df5").delete();
//		Worker.deleter(WORKSPACE_SID, "WK64f26af1829979338e9cfc917e957aea").delete();
		
		/*Worker worker = Worker.fetcher(WORKSPACE_SID, "WKaee7e4fa32c3cafb0adbc5b63de25738").fetch();
		ResourceSet<Reservation>  resourceSet = Reservation.reader(WORKSPACE_SID, "WKaee7e4fa32c3cafb0adbc5b63de25738").setReservationStatus(Reservation.Status.ACCEPTED).read();
		
		resourceSet.forEach(reservation -> {
			String taskSid = reservation.getTaskSid();
			System.out.println(taskSid);
//			System.out.println(Task.deleter(WORKSPACE_SID, taskSid).delete());
//			Reservation.reader(WORKSPACE_SID, reservation.)
		});*/
		
		/*Worker.updater(WORKSPACE_SID, "WKaee7e4fa32c3cafb0adbc5b63de25738").("{\"Hai\":\"Helloo\"}").update();*/
		}

}
