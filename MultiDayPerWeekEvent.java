import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public class MultiDayPerWeekEvent extends CalendarEvent
{

	public MultiDayPerWeekEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime, GregorianCalendar repeat, int days[])
	{
		super(description,location,startTime,endTime);
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		// TODO Auto-generated method stub
		
	}
}
