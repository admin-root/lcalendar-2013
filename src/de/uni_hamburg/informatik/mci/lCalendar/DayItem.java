package de.uni_hamburg.informatik.mci.lCalendar;

public class DayItem {
	
	private String weekName;
	private int dayNummer;
	
	
	public DayItem(String weekName, int dayNummer){
		this.weekName = weekName; 
		this.dayNummer = dayNummer; 
	}

	public String getWeekName() {
		return weekName;
	}

	public void setWeekName(String weekName) {
		this.weekName = weekName;
	}

	public int getDayNummer() {
		return dayNummer;
	}

	public void setDayNummer(int dayNummer) {
		this.dayNummer = dayNummer;
	}
	
	public String toString(){
		return weekName +" " + dayNummer; 
	}

}
