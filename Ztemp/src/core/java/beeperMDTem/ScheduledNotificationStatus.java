package core.java.beeperMDTem;

/**
 * This ENUM contains the ScheduledNotificationStatus - Status of Scheduled Notifications
 * 
 * @author Raghu Madaan
 * @since V2.0.0_06242016
 */
public enum ScheduledNotificationStatus {
	WAITING,
	COMPLETED,
	INVALID,
	FAILED,
	DISABLED,
	QUALIFIED, //This will be used in delays to identify if the notification is qualified to be sent
	RETRY_FOR_LANGUAGE_CHANGE // This will be used in preferred language select and message re-send in preferred language
}
