import java.util.*;
import java.text.*;
class DataGenerator{
	public String getDate(String format) {
		DateFormat Dformat = new SimpleDateFormat(format);
		Date D = new Date();
		String	formattedDate = Dformat.format(D);
		return formattedDate;
	}
}
 class CollectionFive {

	public static void main(String [] args) {
		Scanner str = new Scanner(System.in);
		System.out.print("Enter the desired date format (include spaces) :  ");
		String string = str.nextLine();
		String [] strarr = string.split(" ");
		List<String> strlist = new ArrayList();
		for (int i =0;i<strarr.length;i++)
		strlist.add(strarr[i]);
		String delim = "/";
		String format = String.join(delim,strlist);
		System.out.println("you want date in following format :  "+format);
		if (format.contains("yyyy") && format.contains("mm") && format.contains("dd"))
		{
		DataGenerator obj =new DataGenerator() ;
		
		System.out.print("  Today's date is "+obj.getDate(format));
		
	}else System.out.print("Please Enter Correct Format");
	}

}
