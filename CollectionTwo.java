import java.util.*;


class ListManager1{
	
	public  ArrayList<String> getArrayList(ArrayList<String> list) {
	ArrayList<String> listsorted = new ArrayList<String>(list);
	Collections.sort(listsorted);
	return (listsorted);
}
}

public class CollectionTwo{

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner str = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size  = n.nextInt();
		System.out.println("Enter the elements in string : ");
		for (int i = 0;i<size;i++) {
		String string  = str.nextLine();
		list.add(string);
				}
		ListManager1 obj = new ListManager1();
		System.out.print(obj.getArrayList(list));
	}

}
