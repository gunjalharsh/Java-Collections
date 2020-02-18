import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class CollectionVotar{
	public static int calculateAge(String dob){
		LocalDate today=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  		LocalDate parsedDate = LocalDate.parse(dob, formatter);
		Period age = Period.between(parsedDate, today);
		return age.getYears();
	}
	public static List<String> getEligibleVoter(HashMap<String, String> mapObj){
		List<String> listObj=new ArrayList<String>();
		Iterator<Map.Entry<String, String>> itr = mapObj.entrySet().iterator(); 
		while(itr.hasNext()){
			Map.Entry<String, String> entry = itr.next(); 
			int ageCheck=calculateAge(entry.getKey());
			if(ageCheck>=18){
				listObj.add(entry.getValue());
			}
		}
		return listObj;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		HashMap<String, String> obj=new HashMap<String, String>();
		System.out.println("\nEnter total number of Voters to find eligibility :");
		int n=s.nextInt();
		String[] voterDob=new String[n];
		String[] voterName=new String[n];
		System.out.println("\nEnter Name and DOB(DD-MM-YYYY) of Voters :");
		for(int i=0;i<n;i++){			
			voterName[i]=s.next();
			voterDob[i]=s.next();
			obj.put(voterDob[i], voterName[i]);
		}
		List<String> voterList=new ArrayList<String>();
		voterList=getEligibleVoter(obj);
		System.out.println("\n-----------Eligible Voters List-----------\n");
		for(String i: voterList){
			System.out.println("\t\t"+i);
		}
	}
}