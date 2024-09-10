import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public class PriorityEvent extends CalendarEvent
{
	public PriorityEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime)
	{
		super(description,location,startTime,endTime);
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		// TODO Auto-generated method stub
		
	}


}
