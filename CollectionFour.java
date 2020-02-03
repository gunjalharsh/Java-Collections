import java.util.*;

class MapManager{
	
	public Set<Integer> getKeys(HashMap<Integer,String> hashdata) {
		
	Set<Integer>keys = hashdata.keySet(); 
		
		return (keys);
	}
}

public class CollectionFour {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		Scanner s  = new Scanner(System.in);
		HashMap<Integer,String> hashdata = new HashMap<Integer,String>();
		System.out.print("Enter number of entries : ");
		int n = number.nextInt();
		
		System.out.println("Enter the data : ");
		for (int i =1;i<=n;i++) {
			System.out.print("    "+i+" :- ");
			String string = s.nextLine();
			hashdata.put(i , string);
			
		}
		MapManager obj = new MapManager();
		System.out.print("Set of keys in HashMap : "+obj.getKeys(hashdata));
	}
	
}
