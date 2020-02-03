import java.util.*;
public class CollectionTen {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the Digits : ");
		String n = num.nextLine();  
		int number[] = new int[n.length()];
		String narr[]= new String[n.length()];
		String nums = new String();
		
		for (int i =0 ; i<n.length();i++)
	         number[i] =Integer.parseInt(Character.toString(n.charAt(i)));
			int num2=number[n.length()-1];
			for (int i =0 ; i<n.length()-1;i++)
		{
			
			if (number[i]<number[i+1]) {
			
				nums +=  number[i+1]-number[i];
				}
			if (number[i]>number[i+1]) {
					nums += number[i]-number[i+1];
				}
		}
		
		System.out.print(nums+num2);
	}

}
