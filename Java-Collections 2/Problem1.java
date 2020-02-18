package str;

import java.util.Scanner;
import java.util.ArrayList;



public class Problem1 {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner str =new Scanner(System.in);
		Scanner str1 =new Scanner(System.in);
		
	ArrayList<Integer> list1 =new ArrayList<Integer>();
	ArrayList<Integer> list2 =new ArrayList<Integer>();
	
	 
		 
		 System.out.print("Enter the size of array 1 :");
		 int n1 =str.nextInt();
		 
		 System.out.println("Enter the size of array 2 :");
		 int n2=str1.nextInt();
		 
		 System.out.println("Enter the elements in array 1:");
		 
		 for(int i=0;i<n1;i++)
		 {
		 int num1 =str.nextInt();
		 list1.add(num1);
		 }
		 
		 System.out.println("Enter the elements in array 2:");
		 
		 for(int i=0;i<n2;i++)
		 {
		 int num2 =str1.nextInt();
		 list2.add(num2);
		 }
		 
		 list1.retainAll(list2);
		 
		 System.out.println("list1" + list1);
		
	
		 
		 for (int i : list1)
		 {
			 
			 sum = sum+i;
		 }
		 
		 System.out.println("sum : " +sum);
		 
		 
		 
			 
		 }
		 
}





