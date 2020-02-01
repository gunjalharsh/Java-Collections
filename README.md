# Java-Collections
1.Create a class with a method which can remove all the elements from a list
 other than the collection of elements specified.

Class Name :ListManager

Method Name: removeElements
 
Method Description : Remove all the elements from a list other than the 
collection of elements specified. 

Argument: List<String> list1, List<String> list2;

Return Type : List- ArrayList contains the resulting List after the
 removal process.

Logic : Accept two List objects list1 and list2 and remove all the elements
 from list 1 other than the elements contained in list2.
This should be done in single step process without using loop.  
-----------------------------------------------------------------
2. Create a class that can accept an array of String objects and  return them
 as a sorted List 

Class Name 		: ListManager
Method Name 		: getArrayList 
Method Description 	: Converts the String array to ArrayList and sorts it
Argument		: String []elements  
Return Type 		: List- ArrayList containing the elements of the String array in sorted order 
Logic 			: Load the elements in to an ArrayList and sort it. 

--------------------------------------------------------
3. Create a method that returns collection that contain only unique String object in the sorted order. 

Class Name 		: UniqueCollection 
Method Name 		: getCollection 
Method Description 	: Accepts a String array and load the elements into a collection that can hold only unique element in a sorted order. 
Argument		: String []elements 
Return Type		: Interface type of the Collection used
Logic			: Accept a String array, convert it to a collection of unique elements stored in sorted order and return the results. 

-------------------------------------------------------------
4. Create a class which accepts a HashMap and returns the keys in the Map 

Class Name 		: MapManager   
Method Name 		: getKeys 
Method Description 	: Returns the keys in the hasp map 
Argument 		: HashMap 
Return Type		: Set 
Logic 			: Retrieve the keys in hash map and return the set of keys 

-------------------------------------------------------------

5. Create a method that returns the current date in the format specified 

Class Name		: DataGenerator 
Method Name		: getDate 
Method Description	: Returns the current date 
Argument 		: String format 
Return Type		: String date 
Logic			: Return the current date in the specified format

-----------------------------------------------------------------
6. Create a method that calculates the age of a person based on his date of birth 

Class Name 		: AgeCalculator  
Method Name 		: calculateAge 
Method Description	: Returns the age of the person 
Argument String 	: dob,String format 
Return Type 		: int age 
Logic			: Returns the age of the person based on his date of birth 

----------------------------------------------------------------------
7. Government has announced a rule stating that all the citizens who are 18 years and above(>=18)
are eligible to get a voter's card.The details of the residents and their date of births
are stored in a hash map. Write a method which accepts the residents details as
Hashmap and return the names of the people eligible for the voter's card as an arraylist.
The date of birth is stored in dd/MM/yyyy format.

Input Specification:
Input1: HashMap<string,string>
Output: Arraylist<string>

Input2:{'aruna': '12/04/1998','lata':'24/03/1987'}
Output:[arun,lata]</string></string,string>

---------------------------------------------------------------------
8. Given a string array as input.The array contains the states and capital 
names separated by a '_'.Write a method which accepts the string array and 
a state name and return the capital of the state.
Note: the check must be case insensitive.

Input1:{'TN_Chennai','Kerala_TVM','Karnataka_BNGLR'}
Input2:Karnataka
Output:BNGLR

----------------------------------------------------------------------
9. Given an arraylist of strings,write a method to return the string
formed by the last character of each string.

Input:
['ab','a','abcd']

Output:
['car','java','mat']

--------------------------------------------------------------------
10. Given a 'n' digit number.Write a program to find a number formed by the
difference of consecutive digits. Last digit can be left as it is.

Input: 21457
Output: 13127

Input2: 578461
Output2: 214251
