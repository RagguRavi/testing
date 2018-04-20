package core.java.beeperMDTem;

import java.util.Date;

/**
 * Appointment Domain represents an appointment with Patient and Doctor
 * 
 * @author Raghu Madaan
 * @since V2.0.0_05262016
 */
public class Appointment {
	
	//DB Id
	private Long id;
	
	//Version used as optimistic locking
	//@Version
	/**
	 * NOTE
	 * 
	 * For now, commenting Optimistic Locking by Hibernate.
	 * In future, will be using Pessimistic Locking Mechanism for this Domain only.
	 * Some locking errors has been seen in real time while confirming appointments/slot filling.
	 * We need Pessimistic Locking mechanism. 
	 */
	private Long version;
	
	//Contains Appointment Type For ex. Follow-Up, Surgery, etc.
	private String type;
	
	private Date actualScheduledDate;
	
	private Integer duration;
	
	private Date currentAppointmentDate;
	
	private Date admitTime;
	
	private Date appointmentTimeAccordingToPatient;
	
	private Integer priority = 1;
	
	//CONFIRMED/NOT_CONFIRMED/CANCELLED
	private String status;
	
	private String color;
	
	private String textColor;
	
	private Date modifiedDate;
	
	//If an appointment is shifted from its original position to a slot,
    //This value will be true. This will be helpful so that we will not update this appointment from EHR systems
    boolean isSlotFillingAppointment = false;
	
	//If a delay has been created manually, then that would be saved as an appointment with this value as true.
    boolean isManualDelayEvent = false;
	
	//Some of the systems have patientId in their system which can define uniqueness like Practice Mate, AthenaHealth, etc.
  	private String systemId;
  	
  	//Name of the External System for which this Location is Pulled
  	private String systemName;
	
	private String cancellationReason;
	
  	//The date when the appointment was rescheduled. If appointment is not rescheduled, it will be null.
	private Date reschedulingDate;
  	
	//No of times the appointment has been scheduled. By default, it will be 1. We will increment it by 1 for each REscheduling. For e.g if an appointment has been rescheduled two times, it will be 3.
	private Integer schedulingCount = 1;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Date getActualScheduledDate() {
		return actualScheduledDate;
	}

	public void setActualScheduledDate(Date actualScheduledDate) {
		this.actualScheduledDate = actualScheduledDate;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Date getCurrentAppointmentDate() {
		return currentAppointmentDate;
	}

	public void setCurrentAppointmentDate(Date currentAppointmentDate) {
		this.currentAppointmentDate = currentAppointmentDate;
	}

	public Date getAdmitTime() {
		return admitTime;
	}

	public void setAdmitTime(Date admitTime) {
		this.admitTime = admitTime;
	}

	public Date getAppointmentTimeAccordingToPatient() {
		return appointmentTimeAccordingToPatient;
	}

	public void setAppointmentTimeAccordingToPatient(Date appointmentTimeAccordingToPatient) {
		this.appointmentTimeAccordingToPatient = appointmentTimeAccordingToPatient;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public boolean isSlotFillingAppointment() {
		return isSlotFillingAppointment;
	}

	public void setSlotFillingAppointment(boolean isSlotFillingAppointment) {
		this.isSlotFillingAppointment = isSlotFillingAppointment;
	}

	public boolean isManualDelayEvent() {
		return isManualDelayEvent;
	}
	
	public void setManualDelayEvent(boolean isManualDelayEvent) {
		this.isManualDelayEvent = isManualDelayEvent;
	}
	
	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	
	public String getCancellationReason() {
		return cancellationReason;
	}
	
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	
	public Date getReschedulingDate() {
		return reschedulingDate;
	}

	public void setReschedulingDate(Date reschedulingDate) {
		this.reschedulingDate = reschedulingDate;
	}
	
	public Integer getSchedulingCount() {
		return schedulingCount;
	}

	public void setSchedulingCount(Integer schedulingCount) {
		this.schedulingCount = schedulingCount;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", type=" + type + ", actualScheduledDate=" + actualScheduledDate
				+ ", duration=" + duration + ", currentAppointmentDate=" + currentAppointmentDate
				+ ", appointmentTimeAccordingToPatient=" + appointmentTimeAccordingToPatient + ", status=" + status
				+ ", modifiedDate=" + modifiedDate + ", reschedulingDate=" + reschedulingDate + ", schedulingCount="
				+ schedulingCount + "]";
	}
	
	
}
