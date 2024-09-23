import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public abstract class CalendarEvent
{
	private GregorianCalendar endTime;
	private GregorianCalendar startTime;
	private String location;
	private String description;
	
	public CalendarEvent(String description,String location, GregorianCalendar startTime, GregorianCalendar endTime)
	{
		super();
		this.setDescription(description);
		this.setLocation(location);
		this.setStartTime(startTime);
		this.setEndTime(endTime);
		
	}
	
	public abstract void scheduleEvent(MeetingCalendar Calendar);

	public GregorianCalendar getEndTime()
	{
		return endTime;
	}

	public void setEndTime(GregorianCalendar endTime)
	{
		this.endTime = endTime;
	}

	public GregorianCalendar getStartTime()
	{
		return startTime;
	}

	public void setStartTime(GregorianCalendar startTime)
	{
		this.startTime = startTime;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
	
}