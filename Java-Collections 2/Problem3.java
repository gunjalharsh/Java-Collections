package str;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class Problem3 {

	public static void main(String[] args) {
		
		
		
		String[] s1={"Hari#12#13","Kartik#12#10"};
		
		HashMap<String,Integer> p = new HashMap<String,Integer>();
				
		for(int i=0;i<s1.length;i++){
			
			String s2=s1[i];
			
		StringTokenizer t =new StringTokenizer(s2,"#");
		String s3 = t.nextToken();
	
		
		int n1 =Integer.parseInt(t.nextToken());
		int n2 =Integer.parseInt(t.nextToken());
	
		int n = n1+n2;
		

		p.put(s3,n);
		}

		System.out.println(p);
			//	System.out.println(p.values());
				
		// int r=Collections.max(p.values());
			//System.out.println("Maximun Marks are :"+ r);
	
		
		
		   String maxKey=null;
	        
			int maxValue = Integer.MIN_VALUE; 
	        for(Map.Entry<String,Integer> entry : p.entrySet()) {
	            if(entry.getValue() > maxValue) {
	             maxValue = entry.getValue();
	             maxKey = entry.getKey();
	        }
	           
	    }
	        System.out.println("Maximun Marks are :"+ maxValue);
	        System.out.println("Name is  :"+maxKey);


		
		
		
		
		
		
		
		
		
		
		
	
		
			
			
			
		}
	
		
		

	}


