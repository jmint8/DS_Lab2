import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public class OneTimeEvent extends CalendarEvent
{
	public OneTimeEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime)
	{
		super(description,location,startTime,endTime);
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		// TODO Auto-generated method stub
		
	}
}
