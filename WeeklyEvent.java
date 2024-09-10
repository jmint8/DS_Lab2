import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public class WeeklyEvent extends CalendarEvent
{
	private GregorianCalendar repeat;
	private int days[];
	
	public int[] getDays()
	{
		return days;
	}

	public void setDays(int[] days)
	{
		this.days = days;
	}

	public GregorianCalendar getRepeat()
	{
		return repeat;
	}

	public void setRepeat(GregorianCalendar repeat)
	{
		this.repeat = repeat;
	}

	public WeeklyEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime, GregorianCalendar repeat)
	{
		super(description,location,startTime,endTime);
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		// TODO Auto-generated method stub
		
	}
}
