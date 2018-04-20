package core.java.beeperMDTem;

/**
 * This domain represents for an Appointment. This will act as Master Data from whom all the Notifications will be Scheduled
 * 
 * @author Raghu Madaan
 * @since V2.0.0_05192016
 */
public class Notification {
	
	//DB Id
	private Long id;
	
	//Type of Notification i.e. CONFIRMATION or DELAY
	private String type;
	
	//Source like how notification will be sent i.e. CALL or SMS or EMAIL
	private String source;
	
	//MINUTE or HOUR or DAY
	private String unit;
	
	//Actual value of notification
	private Long notificationvalue;
	
	//Every Delay Notification have a buffer that will be take care to qualify weather notification could be sent and to calculate what delay time to say to patient 
	private Integer delayBuffer;
	
	public Notification() {}

	public Notification(Long id, String type, String source, String unit, Long notificationvalue) {
		this.id = id;
		this.type = type;
		this.source = source;
		this.unit = unit;
		this.notificationvalue = notificationvalue;
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
}
