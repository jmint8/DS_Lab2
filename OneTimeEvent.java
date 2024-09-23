import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

public class OneTimeEvent extends CalendarEvent
{
	private String description;
	private String location;
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;

	public OneTimeEvent(String description,String location, 
			GregorianCalendar startTime, GregorianCalendar endTime)
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
		// TODO Auto-generated method stub
		Meeting buD;
		buD = new Meeting(description,location,startTime,endTime);

		Calendar.addMeeting(buD);
		
	}
}
