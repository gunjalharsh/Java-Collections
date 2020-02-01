import java.util.ArrayList;
public class ListManager 
{
	public static void removeElement(ArrayList<String> list1 , ArrayList<String> list2) 
		{
			
			ArrayList<String> list3 = new ArrayList<String> (list1);
			ArrayList<String> list4 = new ArrayList<String> (list2);
			
			list3.retainAll(list4);
			System.out.println(list3);
		}


	public static void main(String args[])
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		
		list1.add("Dhoni");
		list1.add("Hardik");
		list1.add("Shreyas");
		list1.add("Virat");
		
		
		
		System.out.println(list1);
		
		
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("Rishbh");
		list2.add("Virat");
		list2.add("Yuvraj");
		list2.add("Suresh");
			
		System.out.println(list2);
		ListManager.removeElement(list1,list2);
	
		
	}

	}
