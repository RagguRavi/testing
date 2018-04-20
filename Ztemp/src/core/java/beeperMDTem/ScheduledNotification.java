package core.java.beeperMDTem;

import java.util.Date;

/**
 * Contains all the Notifications that are Scheduled to be sent  
 * 
 * @author Raghu Madaan
 * @since V2.0.0_05192016
 */
public class ScheduledNotification {

	//DB Id
	private Long id;
	
	//Type of Notification i.e. CONFIRMATION or DELAY
	private String type;
	
	//Source like how notification will be sent i.e. CALL or SMS or EMAIL
	private String source;
	
	private Date date;
	
	//Status of this notification i.e - WAITING, COMPLETED, FAILED, INVALID - QUALIFY(Used in delays if this notification qualifies to be sent)
	private String status = "WAITING";
	
	//Contains the message if status is FAILED/INVALID
	private String statusMessage;
	
	//Number of times we have re-tried to send a message. For ex. in case of patient did not picks up a call.
	//We will retry to call again after few minutes.
	private int retryCount = 0;
	
	//Every notification that is scheduled to be sent will contain a jmsID which defines the message on JMS Server.
	//This will be useful to delete messages on JMS Server
	private String jmsMessageID;
	
	/** [NOTE] Copying unit and Notification value, so they will be using in delays to re-calculate the time relative to appointmentTimeAccordingToPatient **/
	//MINUTE or HOUR or DAY
	private String unit;
	
	//Actual value of notification
	private Long notificationvalue;
	
	//Every Delay Notification have a buffer that will be take care to qualify weather notification could be sent and to calculate what delay time to say to patient 
	private Integer delayBuffer;
	
	//[Used in Delays] - User has an ability to disable notifications to be sent from the system.
	private boolean isUserDefinedDisabled = false;
	
	//Join column to identify the appointment for this notification
	private String appointment;
	
	
	public ScheduledNotification() {}
	public ScheduledNotification(Long id, String type, Date date) {
		this.id = id;
		this.type = type;
		this.date = date;
	}

	@Override
	public String toString() {
		return "ScheduledNotification [id=" + id + ", type=" + type + ", source=" + source + ", date=" + date
				+ ", status=" + status + ", statusMessage=" + statusMessage + ", retryCount=" + retryCount
				+"]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}

	public String getJmsMessageID() {
		return jmsMessageID;
	}

	public void setJmsMessageID(String jmsMessageID) {
		this.jmsMessageID = jmsMessageID;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getNotificationvalue() {
		return notificationvalue;
	}

	public void setNotificationvalue(Long notificationvalue) {
		this.notificationvalue = notificationvalue;
	}

	public Integer getDelayBuffer() {
		return delayBuffer;
	}

	public void setDelayBuffer(Integer delayBuffer) {
		this.delayBuffer = delayBuffer;
	}

	public boolean isUserDefinedDisabled() {
		return isUserDefinedDisabled;
	}

	public void setUserDefinedDisabled(boolean isUserDefinedDisabled) {
		this.isUserDefinedDisabled = isUserDefinedDisabled;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
	public ScheduledNotification(Long id, String type, String source, Date date, String status, String statusMessage,
			String unit, Long notificationvalue, String appointment) {
		super();
		this.id = id;
		this.type = type;
		this.source = source;
		this.date = date;
		this.status = status;
		this.statusMessage = statusMessage;
		this.unit = unit;
		this.notificationvalue = notificationvalue;
		this.appointment = appointment;
	}
	
	
}
