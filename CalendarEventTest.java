import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalendarEventTest
{
	OneTimeEvent m1;
	OneTimeEvent m2;
	PriorityEvent pm1;
	PriorityEvent pm2;
	WeeklyEvent wm1;
	WeeklyEvent wm2;
	MultiDayPerWeekEvent mdm1;
	MultiDayPerWeekEvent mdm2;
	
	GregorianCalendar ot1st, ot1et;
	GregorianCalendar ot2st, ot2et;
	GregorianCalendar pre1st, pre1et;
	GregorianCalendar pre2st, pre2et;
	GregorianCalendar we1st, we1et;
	GregorianCalendar we2st, we2et;
	GregorianCalendar mde1st, mde1et;
	GregorianCalendar mde2st, mde2et;
	
	@BeforeEach
	void setUp() throws Exception
	{
		ot1st = new GregorianCalendar(2024,9,12,00,00);
		ot2st = new GregorianCalendar(2024,9,12,00,00);
		pre1st = new GregorianCalendar(2024,9,12,00,00);
		pre2st = new GregorianCalendar(2024,9,12,00,00);
		we1st = new GregorianCalendar(2024,9,12,00,00);
		we2st = new GregorianCalendar(2024,9,12,00,00);
		mde1st = new GregorianCalendar(2024,9,12,00,00);
		mde2st = new GregorianCalendar(2024,9,12,00,00);
		
		
		m1 = new OneTimeEvent("OTM1","OLIN101", ot1st,ot1et);
		m2 = new OneTimeEvent("OTM2","OLIN102", ot2st,ot2et);
		pm1 = new PriorityEvent("PM1","YOUNG101",pre1st,pre1et);
		pm2 = new PriorityEvent("PM2","YOUNG102",pre2st,pre2et);
		wm1 = new WeeklyEvent("WE1", "CC101", we1st, we1et, null);
		wm2 = new WeeklyEvent("WE2", "CC102", we2st, we2et, null);
		mdm1 = new MultiDayPerWeekEvent("MDM1", "CROU101", mde1st, mde1et, null, null);
		mdm2 = new MultiDayPerWeekEvent("MDM2", "CROU102", mde2st, mde2et, null, null);
	}

	@Test
	void testCalendarEvent()
	{
		fail("Not yet implemented");
	}

	@Test
	void testScheduleEvent()
	{
		fail("Not yet implemented");
	}

}
