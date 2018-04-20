package core.java.beeperMDTem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



public class TempScheduleNotification {
	static TempScheduleNotification obj = new TempScheduleNotification();
	private static String HOLIDAY_JSON ="[{\"id\":\"11\",\"day\":1,\"month\":1,\"year\":null,\"name\":\"New Year\'s Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"WJS24p2HqWXD\",\"day\":15,\"month\":1,\"year\":2018,\"name\":\"Birthday of Martin Luther King, Jr.\",\"createdBy\":\"SYSTEM\"},{\"id\":\"EIE3DeJbKtr9\",\"day\":19,\"month\":2,\"year\":2018,\"name\":\"Washington\'s Birthday\",\"createdBy\":\"SYSTEM\"},{\"id\":\"igOoLAGru0FC\",\"day\":28,\"month\":5,\"year\":2018,\"name\":\"Memorial Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"47\",\"day\":4,\"month\":7,\"year\":null,\"name\":\"Independence Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"M933N0N9EOHM\",\"day\":3,\"month\":9,\"year\":2018,\"name\":\"Labor Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"kTm6EP1joQmD\",\"day\":8,\"month\":10,\"year\":2018,\"name\":\"Columbus Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"5Jb94nuriqRp\",\"day\":12,\"month\":11,\"year\":2018,\"name\":\"Veterans\' Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"JWX9RbTrSJbl\",\"day\":22,\"month\":11,\"year\":2018,\"name\":\"Thanksgiving Day\",\"createdBy\":\"SYSTEM\"},{\"id\":\"2512\",\"day\":25,\"month\":12,\"year\":null,\"name\":\"Christmas Day\",\"createdBy\":\"SYSTEM\"}]";
	private static String NOTIFICATION_DAYS="MON,TUE,WED,THU,FRI";
	private static String ACTUAL_NOTIFICATION_TIME ="08:00 AM - 08:00 PM";
	private static List<ScheduledNotification> scheduleNotifications = new ArrayList<>();
	public static void main(String[] args) {
		Appointment appointment = obj.getAppointment();
		System.out.println("Appointment Time :"+appointment.getActualScheduledDate());
		obj.adjustConfirmationNotifications(appointment);
		for(ScheduledNotification scheduledNotification:scheduleNotifications) {
			System.out.println(scheduledNotification);
		}

	}
	
	public void adjustConfirmationNotifications(Appointment appointment) {
		try {
//			CustomUserDetails userDetails = utility.getCurrentLoggedInUserDetails();
			//[NOTE] - There may be a possibility that this method runs from a background process like Slot Fill, so userDetails could be null
			//In those cases it is best to find tenant ID from CurrentTenantIdentifierResolverImpl.getTenantIdentifier(). This will return the ThreadLocal TenantId set by the background process somewhere before calling this method
			String tenantIdentifier = null;
//			if(userDetails != null) {
//				tenantIdentifier = userDetails.getTenantIdentifier();
//			} else {
//				tenantIdentifier = CurrentTenantIdentifierResolverImpl.getTenantIdentifier();
//			}
			
			//Get all the previous confirmation notifications of current appointment which are in WAITING state - will keep which are already INVALID/FAILED/COMPLETED/DISABLED
			/*List<String> notificationStatus = new ArrayList<String>();
			notificationStatus.add(ScheduledNotificationStatus.WAITING.name());
			List<ScheduledNotification> olderScheduledConfirmationNotifications = new ArrayList<>();
			for(ScheduledNotification olderScheduledConfirmationNotification : olderScheduledConfirmationNotifications) {
				try {
					//Remove the message from JMS if it is scheduled and contains JMS-ID
					if(olderScheduledConfirmationNotification.getJmsMessageID() != null && !"".equals(olderScheduledConfirmationNotification.getJmsMessageID())) {
//						confirmationMessageSender.deleteMessage(olderScheduledConfirmationNotification);
					}
				} catch(Exception e) {
//					LOGGER.error("Exception in deleting JMS Message with ScheduledNotification ID: " + olderScheduledConfirmationNotification.getId() + " and JMS Message ID: " + olderScheduledConfirmationNotification.getJmsMessageID(), e);
				}
				//Marking Older Scheduled Notification as DISABLED
				olderScheduledConfirmationNotification.setStatus(ScheduledNotificationStatus.DISABLED.name());
				olderScheduledConfirmationNotification.setStatusMessage("This notification has been disabled");
//				scheduledNotificationDAO.saveOrUpdate(olderScheduledConfirmationNotification);
				//Delete from DB [:Raghu] Rather deleting we are marking older notifications as disabled(Useful for tracking)
				//scheduledNotificationDAO.delete(olderScheduledConfirmationNotification);
			}*/
			
			String notificationDays = NOTIFICATION_DAYS;
			String notificationTime = ACTUAL_NOTIFICATION_TIME;
			
			//Get all the Confirmation Master Notifications and schedule the Confirmation notifications for this appointment
			List<Notification> masterNotifications = obj.getMasterConfigurationNotification();
			for(Notification masterNotification : masterNotifications) {
				ScheduledNotification scheduledConfirmationNotification = new ScheduledNotification();
//				scheduledConfirmationNotification.setAppointment(appointment);
				scheduledConfirmationNotification.setType(NotificationType.CONFIRMATION.name());
				String sourceInMasterNotification = masterNotification.getSource();
//				Patient patient = appointment.getPatient();
				//If patient has opted-out for calls, then we will switch to SMS(if he is not opted-out of sms too) 
//				if((NotificationSource.CALL.name().equals(sourceInMasterNotification))&&(patient.isOptedOutForCall())&&(!patient.isOptedOutForText())) {
//					sourceInMasterNotification = NotificationSource.SMS.name();
//				}
//				//If patient has opted-out for SMS, then we will switch to CALL(if he is not opted-out of calls too)
//				if((NotificationSource.SMS.name().equals(sourceInMasterNotification))&&(patient.isOptedOutForText())&&(!patient.isOptedOutForCall())) {
//					sourceInMasterNotification = NotificationSource.CALL.name();
//				}
				scheduledConfirmationNotification.setSource(sourceInMasterNotification);
				
				Calendar eventAppointmentCalendar = Calendar.getInstance();
	            eventAppointmentCalendar.setTime(appointment.getActualScheduledDate());
	            //Calculate the notification date according to the notification unit and value by subtracting them from ActualScheduledDate
	            if(NotificationUnit.MINUTE.name().equals(masterNotification.getUnit())) { //Minute
	                eventAppointmentCalendar.add(Calendar.MINUTE, (int) - (masterNotification.getNotificationvalue()));
	            } else if(NotificationUnit.HOUR.name().equals(masterNotification.getUnit())) { //Hour
	                eventAppointmentCalendar.add(Calendar.HOUR, (int) - (masterNotification.getNotificationvalue()));
	            } else if(NotificationUnit.DAY.name().equals(masterNotification.getUnit())) { //Day
	                eventAppointmentCalendar.add(Calendar.DAY_OF_MONTH, (int) - (masterNotification.getNotificationvalue()));
	            }
	            
	            Date adjustedNotificationTime = adjustNotificationTime(eventAppointmentCalendar.getTime(), notificationDays, notificationTime, NotificationType.CONFIRMATION.name());
	            if(adjustedNotificationTime == null) { // If adjusted notification time is null - we are marking it as INVALID
	            	scheduledConfirmationNotification.setStatus(ScheduledNotificationStatus.INVALID.name());
	            	scheduledConfirmationNotification.setDate(eventAppointmentCalendar.getTime());
	            	scheduledConfirmationNotification.setStatusMessage("Notification time does not fall between allowed timings for Notifications");
	            } else if((adjustedNotificationTime.before(new Date()))) { // If adjusted notification time is in Past - we are marking it as INVALID
	            	scheduledConfirmationNotification.setStatus(ScheduledNotificationStatus.INVALID.name());
	            	scheduledConfirmationNotification.setDate(adjustedNotificationTime);
	            	scheduledConfirmationNotification.setStatusMessage("Notification Time is in Past");
	            } else { // Adjusted Notification time is Valid
	            	scheduledConfirmationNotification.setStatus(ScheduledNotificationStatus.WAITING.name());
	            	scheduledConfirmationNotification.setDate(adjustedNotificationTime);
	            	scheduledConfirmationNotification.setStatusMessage("Waiting to be sent");
	            }
//	            scheduledNotificationDAO.saveOrUpdate(scheduledConfirmationNotification);
	            scheduleNotifications.add(scheduledConfirmationNotification);
	           
	            //Schedule it in JMS - if in WAITING State
//	            if(ScheduledNotificationStatus.WAITING.name().equals(scheduledConfirmationNotification.getStatus())) {
//		            try {
//						String jmsMessageID = confirmationMessageSender.scheduleMessage(scheduledConfirmationNotification, tenantIdentifier);
//						scheduledConfirmationNotification.setJmsMessageID(jmsMessageID);
//						scheduledNotificationDAO.saveOrUpdate(scheduledConfirmationNotification);
//					} catch(Exception e) {
//						LOGGER.error("Exception in scheduling JMS Message: ", e);
//					}
//	            }
			}
		} catch (Exception e) {
				System.out.println(e);
		}
	}

	
	 public Date adjustNotificationTime(Date actualReminderTime, String notificationDays, String notificationTime, String notificationType) {
	        if(isValidNotificationDate(actualReminderTime, notificationDays, notificationTime)) {
	            return actualReminderTime;
	        } else { //Calculate Valid Time
	        	if(NotificationType.CONFIRMATION.name().equals(notificationType)) { //Find Valid Reminder date if date is not valid - Only For Confirmation Notifications
	    	        //Checking if any notification of this appointment is configured for this time
	        		return calculateValidReminderDate(actualReminderTime, notificationDays, "04:00 PM");
	        	} else {
	        		return null;
	        	}
	        }
	    }
	
	 public boolean isValidNotificationDate(Date actualNotificationDate, String notificationDays, String notificationTime) {
	        String dayOfWeekStr = getDayOfWeek(actualNotificationDate);
	        //Check if this is in valid day of week
	        if(notificationDays.indexOf(dayOfWeekStr) == -1) {
	            //actualNotificationDate is not in configured notification days
	            return false;
	        }
	     
	        //Check if user enable notification holiday feature or not
	        if(true) { 
	        	//check if this is a holiday 
	        	List<HolidayBO> holidaysList = obj.convertJsonToList(HOLIDAY_JSON);
	        	if(holidaysList!=null) {
	        		Calendar calendar=Calendar.getInstance();
	        		calendar.setTime(actualNotificationDate);

	        		// Calender month start from 0 so adding 1 in month
	        		int day=calendar.get(Calendar.DAY_OF_MONTH);
	        		int month=calendar.get(Calendar.MONTH)+1;
	        		int year=calendar.get(Calendar.YEAR);
	        		//Here we are comparing year also if holiday from database also have year
	        		//[NOTE]-if we don't check for year then -> if on 2 Jan 2018 is a holiday then on 2 Jan 2017 also holiday
	        		boolean isHoliday = holidaysList.stream().anyMatch(holiday -> {
	        			if(holiday.getYear() == null) {
	        				return holiday.getDay() == day && holiday.getMonth() == month ;
	        			} else {
	        				return holiday.getDay() == day && holiday.getMonth() == month && holiday.getYear() == year;
	        			}
	        		});
		        	//If the date is a holiday - it is not a valid notification date
		        	if(isHoliday) {
		        		return false;
		        	}
	        	}
	        } 
	        
	        //Now check Time of a day
	        LocalTime actualNotificationLocalTime = LocalTime.fromDateFields(actualNotificationDate);
	        String startTimeStr = notificationTime.split("-")[0].trim();
	        String endTimeStr = notificationTime.split("-")[1].trim();

	        DateTimeFormatter formatter = DateTimeFormat.forPattern("hh:mm a");
	        LocalTime startTime = LocalTime.parse(startTimeStr, formatter);
	        LocalTime endTime = LocalTime.parse(endTimeStr, formatter);

	        //actualNotificationLocalTime must be between startTime and endTime
	        if(actualNotificationLocalTime.isBefore(startTime)) {
	            return false;
	        } else if(actualNotificationLocalTime.isAfter(endTime)) {
	            return false;
	        } else {
	            return true;
	        }
	    }

	
	 public Date calculateValidReminderDate(Date actualNotificationDate, String notificationDays, String newConfiguredReminderTime) {
	    	LocalDateTime actualNotificationLocalDateTime = LocalDateTime.fromDateFields(actualNotificationDate);
	    	Date calculatedDate = null;
			List<HolidayBO> holidayList= obj.convertJsonToList(HOLIDAY_JSON);

	    	for(int weekDay = 0; weekDay < 7; weekDay++) { //Find till last 7 days, if not found return null;
	    		actualNotificationLocalDateTime = actualNotificationLocalDateTime.minusDays(1);
	    		String newDayOfWeekStr = getDayOfWeek(actualNotificationLocalDateTime.toDate());
	    		if(notificationDays.indexOf(newDayOfWeekStr) != -1) { //Day Found in Configured notification days
	    			if(true) { 
	    				//check if Holiday exist on this day or not
	    				int day = actualNotificationLocalDateTime.getDayOfMonth();
	    				int month = actualNotificationLocalDateTime.getMonthOfYear();
	    				int year = actualNotificationLocalDateTime.getYear();
	    				if(holidayList != null) {
	    					//comparing year also if holiday from database also have year
	    					//[NOTE]-if we don't check for year then -> if 2 Jan 2018 is a holiday then 2 Jan 2017 also holiday
	    					boolean isHoliday =holidayList.stream().anyMatch(holiday-> {
	    						if(holiday.getYear()==null) {
	    							return holiday.getDay() == day && holiday.getMonth() == month;
	    						} else {
	    							return holiday.getDay() == day && holiday.getMonth() == month && holiday.getYear() == year;
	    						}
	    					});
	    					//If this is a holiday - do not set it as a valid date and proceed with other dates
	    					if(isHoliday) {
	    						continue;
	    					}
	    				}
	    			}

	                DateTimeFormatter formatter = DateTimeFormat.forPattern("hh:mm a");
	                LocalTime newReminderTime = LocalTime.parse(newConfiguredReminderTime, formatter);

	                actualNotificationLocalDateTime = actualNotificationLocalDateTime.withHourOfDay(newReminderTime.getHourOfDay());
	                actualNotificationLocalDateTime = actualNotificationLocalDateTime.withMinuteOfHour(newReminderTime.getMinuteOfHour());
	                actualNotificationLocalDateTime = actualNotificationLocalDateTime.withSecondOfMinute(newReminderTime.getSecondOfMinute());

	                calculatedDate = actualNotificationLocalDateTime.toDate();
	                break;
	            }
	        }
	        return calculatedDate;
	    }
	 
	 public String getDayOfWeek(Date actualNotificationDate) {
			LocalDateTime actualNotificationLocalDateTime = LocalDateTime.fromDateFields(actualNotificationDate);
			// get and check day of week
			int dayOfWeekInt = actualNotificationLocalDateTime.getDayOfWeek();
			String dayOfWeekStr = "";

			if (dayOfWeekInt == DateTimeConstants.MONDAY) {
				dayOfWeekStr = "MON";
			} else if (dayOfWeekInt == DateTimeConstants.TUESDAY) {
				dayOfWeekStr = "TUE";
			} else if (dayOfWeekInt == DateTimeConstants.WEDNESDAY) {
				dayOfWeekStr = "WED";
			} else if (dayOfWeekInt == DateTimeConstants.THURSDAY) {
				dayOfWeekStr = "THU";
			} else if (dayOfWeekInt == DateTimeConstants.FRIDAY) {
				dayOfWeekStr = "FRI";
			} else if (dayOfWeekInt == DateTimeConstants.SATURDAY) {
				dayOfWeekStr = "SAT";
			} else if (dayOfWeekInt == DateTimeConstants.SUNDAY) {
				dayOfWeekStr = "SUN";
			}
			return dayOfWeekStr;
		}
		
	 public List<HolidayBO> convertJsonToList(String holidayJson) {
		 ObjectMapper objectMapper = new ObjectMapper();
		 List<HolidayBO> holidayDataList = new ArrayList<>();
		 if (holidayJson != null) {
			 try {
				 List<Map<String, String>> list = objectMapper.readValue(holidayJson,new TypeReference<List<Map<String, String>>>() {});
				 list.stream().forEach(mapObject -> {
					 HolidayBO holidayData = new HolidayBO(mapObject.get("id"),Integer.valueOf(mapObject.get("day")),Integer.valueOf(mapObject.get("month")),mapObject.get("name"));
					 if (mapObject.get("createdBy") != null) {
						 holidayData.setCreatedBy(mapObject.get("createdBy"));
					 }
					 if(mapObject.get("year") != null) {
						 holidayData.setYear(Integer.valueOf(mapObject.get("year")));
					 }
					 holidayDataList.add(holidayData);
				 });
			 } catch (Exception e) {
				 System.out.println(e);
			 }
		 }
		 return holidayDataList;
	 }
	 
	/* public List<ScheduledNotification> getScheduleNotificationList(){
		 Calendar c1 = Calendar.getInstance();
		 
		 ScheduledNotification s1 = new ScheduledNotification(1l,NotificationType.CONFIRMATION.name(),null);
		 ScheduledNotification s2 = new ScheduledNotification(1l,NotificationType.CONFIRMATION.name(),null);
		 ScheduledNotification s3 = new ScheduledNotification(1l,NotificationType.CONFIRMATION.name(),null);
		 ScheduledNotification s4 = new ScheduledNotification(1l,NotificationType.CONFIRMATION.name(),null);
		 ScheduledNotification s5 = new ScheduledNotification(1l,NotificationType.CONFIRMATION.name(),null);
		 
		 return null;
	 }*/
	 
	 public Appointment getAppointment() {
		 Appointment appointment = new Appointment();
		 Calendar calendar = Calendar.getInstance();
		 calendar.set(Calendar.MONTH, 1);
		 calendar.set(Calendar.DAY_OF_MONTH, 12);
		 calendar.set(Calendar.HOUR_OF_DAY,13);
		 calendar.set(Calendar.MINUTE,0);
		 appointment.setId(123l);
		 appointment.setActualScheduledDate(calendar.getTime());
		 appointment.setStatus("UNCONFIRMED");
		 appointment.setDuration(15);
		 appointment.setType("FU");
		 return appointment;
	 }
	 
	 public List<Notification> getMasterConfigurationNotification(){
		 Notification n1 = new Notification(1l, "CONFIRMATION", "SMS", "DAY", 7l);
		 Notification n2 = new Notification(2l, "CONFIRMATION", "CALL", "DAY", 5l);
		 Notification n3 = new Notification(3l, "CONFIRMATION", "SMS", "DAY", 3l);
		 Notification n4 = new Notification(4l, "CONFIRMATION", "EMAIL", "DAY", 2l);
		 Notification n5 = new Notification(5l, "CONFIRMATION", "SMS", "DAY", 1l);
		 
		 List<Notification> nList = new ArrayList<>();
		 nList.add(n1);
		 nList.add(n2);
		 nList.add(n3);
		 nList.add(n4);
		 nList.add(n5);
		 
		 
		 return nList;
	 }
	 
}
