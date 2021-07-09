package com.strings;

public class StringUtils{

	public static void main(String[] args){

		StringUtils su = new StringUtils();

		String someDate = "12/25/2019"; // make sure to test other dates 1/13/19, 03/03/2019, etc.
		String month, year, day;

		// test date exratction methods
		month = su.getMonthFromDate(someDate);
		System.out.println(month);
		day = su.getDayFromDate(someDate);
		System.out.println(day);
		year = su.getYearFromDate(someDate);
		System.out.println(year);
 
	}

	public String getMonthFromDate(String dateStr){
		// replace the return statement with code to extract the month
		// from a date string and then return it
		int indexFirstSlash = dateStr.indexOf("/");
		String month = dateStr.substring(0, indexFirstSlash);
		return month; 
	}

	public String getDayFromDate(String dateStr){
		// replace the return statement with code to extract the day
		// from a date string and then return it
		int indexFirstSlash = dateStr.indexOf("/");
		int indexOfDay = indexFirstSlash + 1;
		int indexLastSlash = dateStr.lastIndexOf("/");
		String day = dateStr.substring(indexOfDay, indexLastSlash);
		return day;
	}

	public String getYearFromDate(String dateStr){
		// replace the return statement with code to extract the year
		// from a date string and then return it
		int indexLastSlash = dateStr.lastIndexOf("/");
		int indexOfYear = indexLastSlash + 1;
		int endOfString = dateStr.length();
		String year = dateStr.substring(indexOfYear, endOfString);
		return year;
	}

}