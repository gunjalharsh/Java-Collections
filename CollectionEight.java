import java.util.*;


public class CollectionEight {

	public static void main(String [] args) {
		int count = 0;
		
		Scanner str = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		
		System.out.print("Enter the number of entries :- ");
		
		int n = num.nextInt();
		String string[] = new String[n];
		String name[] = new String[n];
		
		System.out.println("Enter the entries :- ");
		
		
		for(int i=0;i<n;i++) {
			
			
			string[i] = str.nextLine();
			name[i] = string[i].toUpperCase();
			
		} 
		
		
		System.out.print("Enter the state : ");
		String search = str.next();
		String searchstring = search.toUpperCase();
		
		for (int i =0;i<n;i++) {
			for (int j=0;j<name[i].length();j++) {
				
				if (j==name[i].indexOf("_") && name[i].contains(searchstring)) {
					
					System.out.println("State Code : "+name[i].substring(name[i].indexOf("_")+1,name[i].length()));
					count++;
					
				}
				 
			}
			
		}
		
		if(count==0) {System.out.print("No state with name '"+searchstring+"' present in records");}
		
	}
}
