package project;

public class Date {

	
		private int month;
		private int day;
		private int year;
		
		private static final int[] daysPerMonth = {0 ,31, 28, 31, 30, 31, 31, 30, 31, 30,31};

		public Date(int month, int day, int year) {
			
			if(month <= 0 || month > 12)
				System.out.println("Error");
			
			if( day <= 0|| (day > daysPerMonth[month] && !(month == 2 && day == 29)))
				System.out.println("day (" + day + ") out-of-range for the specfied month and year");
			
			if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
				System.out.println("day (" + day + ") out-of-range for the specified month and year");
			
				
	
				
			this.month = month;
			this.day = day;
			this.year = year;
			
			System.out.printf("Data object  constructor for data %s%n", this);
		}
		
		public String toString(){
			return String.format("%d/%d/%d", month, day, year);
		}
		
	

}
