package date;

import java.time.LocalDate;

public class ExampleDate {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalDate birthDate=LocalDate.of(2004, 7, 7);
		
	/*	System.out.println(date.toString());
		System.out.println("your birth date: "+date.toString());
		
		int year=birthDate.getYear();
		System.out.println("GetMonth--> "+birthDate.getMonth());
		System.out.println("GetYear--> "+year);
	
		System.out.println("Your Age= "+getAge(birthDate));  */
		
		System.out.println("GetDayOfMonth--> "+birthDate.getDayOfMonth());
		System.out.println("GetDayOfYear--> "+birthDate.getDayOfYear());
		System.out.println("GetDayOfWeek--> "+birthDate.getDayOfWeek());
		
		System.out.println("are equals? "+date.isEqual(birthDate));
		System.out.println("date is  before? "+date.isBefore(birthDate));
		System.out.println("date is after? "+date.isAfter(birthDate));
		
		System.out.println(date.plusDays(7));
		System.out.println(date.plusWeeks(2));
	}

	private static int getAge(LocalDate birth) {
		LocalDate current=LocalDate.now();
		int age=current.getYear()-birth.getYear();
		if(current.getMonthValue()-birth.getMonthValue()<0) {
			return age-1;
		}
		return age;
	}
}
