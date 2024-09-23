import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

public class WeeklyEvent extends CalendarEvent
{
	private String description;
	private String location;
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;
	
	GregorianCalendar counterS;
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

	public GregorianCalendar getRepeatUntil()
	{
		return repeat;
	}

	public void setRepeatUntil(GregorianCalendar repeat)
	{
		this.repeat = repeat;
	}

	public WeeklyEvent(String description,String location, GregorianCalendar startTime, 
			GregorianCalendar endTime, GregorianCalendar repeat)
	{
		super(description,location,startTime,endTime);
		this.setRepeatUntil(repeat);
		this.description = description;
		this.location = location;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public WeeklyEvent(String description,String location, GregorianCalendar startTime, 
			GregorianCalendar endTime)
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
		Calendar.addMeeting(buD);
		GregorianCalendar counterE = (GregorianCalendar) endTime.clone();
		counterS = (GregorianCalendar) startTime.clone();
		while(counterS.before(repeat)==true)
		{
			Calendar.addMeeting(buD, false);
			
		/*while(repeat.before(startTime))
		{
			if(Calendar.doesMeetingConflict(buD))
			{
				System.out.println("conflicting meetings L");
			}
			else
			{
				Calendar.addMeeting(buD);
			}*/
		counterS.roll(GregorianCalendar.DAY_OF_YEAR, 7);
		counterE.roll(GregorianCalendar.DAY_OF_YEAR, 7);
		buD.setStartTime(counterS);
		buD.setEndTime(counterE);

		}	
		
	}
}
