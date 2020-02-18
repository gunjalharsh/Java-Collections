import java.util.*;

import java.time.*;


class AgeCalculator{
	
	public int calculateAge(String dateObirth) {
		int year = 0,month = 0,day=0;
		
		LocalDate Tdate = LocalDate.now();                         
		String today = Tdate.toString();
		int yyyy = Integer.parseInt((today.substring(0,4)));
		int mm = Integer.parseInt((today.substring(5,7)));
		int dd = Integer.parseInt((today.substring(8,10)));
		
		
		int yyyy0 = Integer.parseInt((dateObirth.substring(0,4)));
		int mm0 = Integer.parseInt((dateObirth.substring(5,7)));
		int dd0 = Integer.parseInt((dateObirth.substring(8,10)));
		
		if (yyyy>yyyy0)
		{ year = yyyy-yyyy0;} 
		else {System.out.print(" Can't calculate age of an Unborn !!! ");}; 
		
		if (mm0<=12) {
		if (mm>mm0)
		{month = mm - mm0 ;} else if(mm<mm0)  { month = mm0 - mm ; } else { month = mm;};
		System.out.print((month)+" month(s) , ");
		}
		else System.out.print(" Calendar still have 12 months only ");
		
		
		if (dd0<=31)
		{
			if (dd>dd0)
			{ day = dd - dd0 ;} else if(dd<dd0)  { day = dd0 - dd ; } else { day = dd;};
			System.out.print((day)+" days and ");
			
		}else System.out.println(" Months still have 31 days atmost ");
		
		
		return (year-1);
	}
	
	
}


public class CollectionSix {

	public static void main(String [] args) {
		
		Scanner str = new Scanner (System.in);
		System.out.print("Enter your Date of Birth (format :- yyyy-mm-dd ) : ");
		String dateObirth = str.nextLine();
		
		
		
		
		
		AgeCalculator obj = new AgeCalculator();
		
		
		
		
		System.out.print(obj.calculateAge(dateObirth)+" years is your Age ");
		
	}
	
	
}