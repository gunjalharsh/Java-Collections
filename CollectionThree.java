import java.util.*;
class UniqueCollection{
	public List<String> getCollection(List<String> strr ) {
		ArrayList<String> string=new ArrayList<String>(strr); 
		Set<String> uniqueValues = new HashSet<String>(string);
	
		List <String> stringSorted = new ArrayList();
		stringSorted.addAll(uniqueValues);
		Collections.sort(stringSorted);
		System.out.println("Sorted Unique String Array is : "+stringSorted);
		return (stringSorted);
	} 

}
 class CollectionThree {

	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");	
		String string  = s.nextLine();
		String[] str = string.split(" ") ;
		List <String> strr = Arrays.asList(str);
		UniqueCollection obj = new UniqueCollection();
		String delim = " ";
			
	String mainstring =String.join(delim,obj.getCollection(strr));
	System.out.print("the answer is : "+mainstring);	
		
		
	}
	
	
	
	
}
