package twilioTest;

import com.twilio.Twilio;

public class IntializeTwilio {
	public static void initializeTwilio() {
		String twilioAccountSid = "AC78da43eaa19064989336e4c246cfb9d7";
	     String twilioAuthToken = "21fada8a1a5bdb1508fb8b1d21aac38a";
	     Twilio.init(twilioAccountSid, twilioAuthToken);
	}
}
