import java.util.*;
 class CollectionNine {

	public static void main(String args[]) {
		ArrayList<String> string = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		Scanner number = new Scanner(System.in);

		System.out.print("Enter the number of Strings : ");
		int n = number.nextInt();
		
		System.out.println("Enter the Strings : ");
		
		for (int i =0 ;i<n;i++) {
			
			String data = s.nextLine();
			string.add(data);
		
		}
	
		String c[] = new String[string.size()];
		
		for (int i=0;i<string.size();i++) {
			c[i] = (String) string.get(i);
			
		}
		
		String word  = new String();
		for (int i=0 ;i<c.length;i++ ) {
			
			
			word =word + c[i].substring(c[i].length()-1);
			
		}
		
		System.out.print("The word formed is : "+word);
		
		
	}
	
	
}
