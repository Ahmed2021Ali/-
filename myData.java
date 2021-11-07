
package test;

import java.util.GregorianCalendar;
public class myData {
    // احمد علي عبدالغني 
	private int year;
	private int month;
	private int day;

	
	myData() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

	
	myData(long elapsedTime) {
		setDate(elapsedTime);
	}

	
	myData(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	
	public int getYear() {
		return year;
	}


	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}


	public string getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
} 
    

