import java.util.*;


class ListManager2{
	
	public static void removeElement(ArrayList<String> list , ArrayList<String> list2) {
		
		ArrayList<String> list1 = new ArrayList<String>(list);
		ArrayList<String> list02 = new ArrayList<String>(list2);
		ArrayList<String> list3 = new ArrayList<String>(list1);
		
		list1.retainAll(list02);
		
		if (list1.size()>=1)
		System.out.print(list1);
		
		else 
			System.out.print(list3);
		
		
	}
	
}

public class CollectionOne{
	
public static void main(String []args) {
	
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Virat");
	list.add("Dhoni");
	list.add("Hardik");
	list.add("Suresh");
	
	
ArrayList<String> list2 = new ArrayList<String>();
	
	list2.add("Dhoni");
	list2.add("Suresh");
	
	
	ListManager.removeElement(list,list2);
	
	
	
	
}
}