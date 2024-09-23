import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

public class PriorityEvent extends CalendarEvent
{
	private String description;
	private String location;
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;
	
	public PriorityEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime)
	{
		super(description,location,startTime,endTime);

		this.description = description;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		Meeting buD;
		buD = new Meeting(description,location,startTime,endTime);
		
		Calendar.addMeeting(buD, true);
		
	}


}
