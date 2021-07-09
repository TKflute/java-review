import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Dates {

public static void main(String[] args) {
		
	//Core Java Review- Dates - 8 and Util
		// Problem 1
		// Create and initialize Date objects
		Date today = new Date();
		System.out.println(today);
		Date firstDayOfThisCentury = new Date(100, 0, 1);
		System.out.println(firstDayOfThisCentury);
		
		
		// Problem 2
		// Parsing a String object into a Date object
		// Convert the 'dateString' variable below into a Date object.
		String dateString = "3/7/2019";
		DateFormat ds = new SimpleDateFormat("MM/dd/yyyy");
		Date dateStringDate = null;
		try {
			dateStringDate = ds.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dateStringDate);
		
		
		
		// Problem 3
		// Calculating time spans
		// Write code that calculates how many years have passed between 'today' and 'firstDayOfThisCentury'
		long diffInMs = today.getTime() - firstDayOfThisCentury.getTime();
		long diffInDays = TimeUnit.DAYS.convert(diffInMs, TimeUnit.MILLISECONDS);
		float diffInYears = (float)diffInDays/365;
		System.out.println(diffInYears);
		
		// Review from Jump
		localDateExample();
		localTimeExample();
		localDateTimeExample();
		zonedDateTimeExample();
		
		System.out.println(convertStringToDate("04/23/2004", "MM/dd/yyyy"));
		System.out.println(convertStringToDate("November 05 2014", "MMMM dd yyyy"));
		System.out.println(convertStringToDate("1993/30/09", "yyyy/dd/MM"));
		
	}
	
	public static void localDateExample() {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today's date is: " + today);
		// this returns new obj (today does not get modified)
		LocalDate newLd = today.plusDays(20);
		System.out.println("20 days from now is: " + newLd);
		
		LocalDate newLd2 = today.minusMonths(2);
		System.out.println("2 months ago was: " + newLd2);
		
		LocalDate ld = LocalDate.of(2021, 07, 15);
		System.out.println(ld);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfWeek());
	}
	
	
	public static void localTimeExample() {
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		// can also set time as military
		LocalTime time = LocalTime.of(13,  30);
		System.out.println(time);
	}
	
	public static void localDateTimeExample() {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}

	public static void zonedDateTimeExample() {
		
		// date and time to store
		LocalDateTime ldt = LocalDateTime.of(2005, 10, 07, 10, 45);
		
		// time zone
		ZoneId id = ZoneId.of("Europe/Paris");
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		System.out.println(zdt);
		
	}
	
	public static LocalDate convertStringToDate(String dateString, String formatStr) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatStr);
		LocalDate ldt = LocalDate.parse(dateString, formatter);
		return ldt;
		
	}
	
	public static ZonedDateTime convertFromEst(String dateTimeString, String format, String zoneId) {
		//convert to date and then to zoned dt
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		LocalDateTime ldt = LocalDateTime.parse(dateTimeString, formatter);
		
		
		ZoneId id = ZoneId.of(zoneId);
		//need to do ldt.atZone(id);
		ZonedDateTime zdt = ldt.atZone(id);
		return zdt;
		
	}
}
