package str;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem2  {

	public static void main(String[] args){
		
		 Scanner str = new Scanner(System.in);
		 
			ArrayList<Integer> list1 =new ArrayList<Integer>();
			
			System.out.println("Enter the element :");
			int n = str.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				
				if(i%2!=0)
				 list1.add(i);
				}
			System.out.println("list1" + list1);
			
		
		int n1 =list1.get(0);
		
			
			for(int i=1;i<list1.size();i++)
			{
				
				if(i%2!=0)
					
					 n1=n1+list1.get(i);
				else
					
					 n1=n1-list1.get(i);
			
			
			
				
			}
			
			
			System.out.println("Output :" + n1);
			
			

	}

}
