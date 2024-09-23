import java.util.GregorianCalendar;
import java.util.Calendar;
import calendar.Meeting;
import calendar.MeetingCalendar;

public class MultiDayPerWeekEvent extends CalendarEvent
{
	private GregorianCalendar repeat;
	private int[] days;

	public MultiDayPerWeekEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime, GregorianCalendar repeat, int days[])
	{
		super(description,location,startTime,endTime);
		this.setRepeatUntil(repeat);
		this.setDays(days);
	}

	@Override
	public void scheduleEvent(MeetingCalendar Calendar)
	{
		// TODO Auto-generated method stub
		Meeting buD;
		buD = new Meeting(getDescription(),getLocation(),getStartTime(),getEndTime());
		GregorianCalendar counterE = (GregorianCalendar) getEndTime().clone();
		GregorianCalendar counterS = (GregorianCalendar) getStartTime().clone();
		while(counterS.before(repeat)==true)
		{
			
			for(int i=0;i<days.length;i++)
			{
				if(days[i] == counterS.get(GregorianCalendar.DAY_OF_WEEK))
				{
					Calendar.addMeeting(buD);
				}
			}
		counterS.roll(GregorianCalendar.DAY_OF_YEAR, 1);
		counterE.roll(GregorianCalendar.DAY_OF_YEAR, 1);
		buD.setStartTime(counterS);
		buD.setEndTime(counterE);
		}
		
	}

	public GregorianCalendar getRepeatUntil()
	{
		return repeat;
	}

	public void setRepeatUntil(GregorianCalendar repeat)
	{
		this.repeat = repeat;
	}

	public int[] getDays()
	{
		return days;
	}

	public void setDays(int[] days)
	{
		this.days = days;
	}
}
