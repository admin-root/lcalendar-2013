package de.uni_hamburg.informatik.mci.lCalendar;

public class MonthItem {

	private DayItem dayItem;
	private String month;
	
	public MonthItem(DayItem dayitem, String month){
		this.dayItem =dayitem; 
		this.month = month; 
		
	}

	
	
	
	public DayItem getDayItem() {
		return dayItem;
	}

	public void setDayItem(DayItem dayItem) {
		this.dayItem = dayItem;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	

}
