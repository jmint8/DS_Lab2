import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public abstract class CalendarEvent
{
	public String getDescription()
	{
		return getDescription();
	}
	public String getLocation()
	{
		return getLocation();
	}
	public GregorianCalendar getStartTime()
	{
		return getStartTime();
	}
	public GregorianCalendar getEndTime()
	{
		return getEndTime();
	}

	public CalendarEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime)
	{
		
	}
	
	public abstract void scheduleEvent(MeetingCalendar Calendar);
	
}