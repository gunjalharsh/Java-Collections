---------------------------JAVA COLLECTIONS PROBLEM STATEMENTS--------------------------------
1. Given two integer arrays, merge the common elements into a new array.
 find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7

------------------------------------------------
2. Retrieve the odd numbers till given input number. add and subtract it 
consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3

-------------------------------------------------
3. arraylist of string type which has name#mark1#mark2#mark3 format. retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak
Hint:Map<String, Integer> =new HashMap<String, Integer>()

---------------------------------------------------------

4. Retrieve the palindorme-true number set from given number limit and
 return the sum
input1:90 input2:120
logic:99+101+111
output:311
Hint:List<Integer> l1=new ArrayList<Integer>();
----------------------------------------------------
5.HashMap with regnum as key and mark as value. find the avg of marks
 whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90

-----------------------------------------------------
6. Retrieve the max from array which is in a odd-index

--------------------------------------------------------
7. Create a program to get the hashmap from the given input string array where the key for the hashmap
   is first three letters of array element in uppercase and the value of hashmap is the element itself
   Input:{“goa”,”kerala”,”gujarat”}                 [string array]
   Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}}    [hashmap]

-------------------------------------------------------------------
8. String[] input1=["Vikas","Lokesh",Ashok]
   expected output String: "Vikas,Lokesh,Ashok"
-------------------------------------------------------------------
9. I/P hashmap<String String>{"ram:hari","cisco:barfi","honeywell:cs","cts:hari"};
   i/p 2="hari";
   o/p string[]={"ram","cts"};

---------------------------------------------------------------------
10.
HashMap<String,Integer> h1={“abc”:50,”efg”:70};
    if the mark is less than 60 then put the output in the
    HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}

---------------------------------------------------------------------
11.
In a hashmap if key is odd then find average of value as integer
    ex: h1={1:4,2:6,4:7,5:9}
        output=(4+9)/2
----------------------------------------------------------------------
12. HashMap<String,String> input1={“mouse”:”100.2”,”speaker”:”500.6”,”Monitor”:”2000.23”};
    String[] input2={“speaker”,”mouse”};
    Float output=600.80(500.6+100.2);

--------------------------------------------------------------------
