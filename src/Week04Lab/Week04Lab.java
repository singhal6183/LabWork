package Week04Lab;

import java.util.*;

public class Week04Lab {

	public static void main(String[] args) {

			// 1. Why would we use a StringBuilder instead of a String?
		
		/*String is immutable, which means that it can not be modified once it is created
		Java provides another Object called StringBuilder that allows a programmer 
		to build a String dynamically and it is mutable means it can be modified.*/
		
			// 		a. Instantiate a new StringBuilder
		System.out.println("\nQuestion 1:");
		StringBuilder myStringBuild = new StringBuilder();
		
			//		b. Append the characters 0 through 9 to it separated by dashes
			// 				Note:  make sure no dash appears at the end of the StringBuilder
		for (int i = 0; i < 10; i++) {
			myStringBuild.append(i);
			if (i != 9) {
				myStringBuild.append("-");
			}
		}
		System.out.println(myStringBuild.toString());
			
			// 2. List of String:
			//		a. Create a list of Strings 
			//		b. Add 5 Strings to it, each with a different length
		
		System.out.println("\nQuestion 2: All elements in List");
		List<String> myList = new ArrayList<String>();
		myList.add("English");
		myList.add("math");
		myList.add("Science");
		myList.add("Art");
		myList.add("Chemistry");
		for(int i=0;i<myList.size();i++){
		    System.out.println(myList.get(i));
		}
		
		
			// 3. Write and test a method that takes a list of strings 
			//			and returns the shortest string
		System.out.println("\nQuestion 3: Shortest string of List");
		System.out.println(findShortString(myList));

			
			// 4. Write and test a method that takes a list of strings 
			//			and returns the list with the first and last element switched
		System.out.println("\nQuestion 4: First and Last element after swapping");
		List<String> swapped = switchFirstLast(myList);
		for (int i=0; i< swapped.size(); i++)
		{
			System.out.println(swapped.get(i));
		}
		
			
			// 5. Write and test a method that takes a list of strings 
			//			and returns a string with all the list elements concatenated to each other,
			// 			separated by a comma
		System.out.println("\nQuestion 5:list elements concatenated to each other separated by a comma");
		System.out.println(listConcat(myList));

			
			// 6. Write and test a method that takes a list of strings and a string 
			//			and returns a new list with all strings from the original list
			// 			containing the second string parameter (i.e. like a search method)
		System.out.println("\nQuestion 6:List elements after adding a string");
		List<String> listString = listWithString(myList,"Hello");
		for (int i=0; i< listString.size(); i++)
		{
			System.out.println(listString.get(i));
		}
			
			// 7. Write and test a method that takes a list of integers 
			//			and returns a List<List<Integer>> with the following conditions specified
			//			for the return value:
			//		a. The first List in the returned value contains any number from the input list 
			//			that is divisible by 2
			//		b. The second List contains values from the input list that are divisible by 3
			//		c. The third containing values divisible by 5, and 
			//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

			
			// 8. Write and test a method that takes a list of strings 
			//			and returns a list of integers that contains the length of each string

		System.out.println("\nQuestion 8:List of calculating length of elements");
		List<Integer> listofInt = listofInteger(myList);
		for (int i=0; i< listofInt.size(); i++)
		{
			System.out.println(listofInt.get(i));
		}
			
			// 9. Create a set of strings and add 5 values
		System.out.println("\nQuestion 9:Set of Strings");
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("Book");
		mySet.add("Pen");
		mySet.add("Pencil");
		mySet.add("Eraser");
		mySet.add("Sharpner");
		
		System.out.println(mySet);
		
	
			// 10. Write and test a method that takes a set of strings and a character 
			//			and returns a set of strings consisting of all the strings in the
			// 			input set that start with the character parameter.


			
			// 11. Write and test a method that takes a set of strings 
			//			and returns a list of the same strings
		
			

			// 12. Write and test a method that takes a set of integers 
			//			and returns a new set of integers containing only even numbers 
			//			from the original set


			
			// 13. Create a map of string and string and add 3 items to it where the key of each
			// 			is a word and the value is the definition of the word

		
			
			// 14. Write and test a method that takes a Map<String, String> and a string 
			// 			and returns the value for a key in the map that matches the
			// 			string parameter (i.e. like a language dictionary lookup)

			
			// 15. Write and test a method that takes a List<String> 
			//			and returns a Map<Character, Integer> containing a count of 
			//			all the strings that start with a given character
			

		}
		
		
		// Method 15:
		
		
		
		// Method 14:
		

		
		// Method 12:
		

		
		// Method 11:
		


		// Method 10:
/*public static HashSet<String>  SetMatchingChar(HashSet<String> mySet1, char ch)
	
	{
	  
	List<String> list = new ArrayList<String>(mySet1);
	  
	  for (int i=0; i<list.size();i++)
	  { if( (list.get(i)).charAt(0) == ch   )
		  List<String> list1= list.get(i);
	  
	  }
	}*/
		

		
		// Method 8:
public static List<Integer>  listofInteger(List<String> myList4)
	
	{
	  
	List<Integer> lengths = new ArrayList<Integer>();
	    for(int i=0; i<myList4.size(); i++)
	    {
	    	lengths.add((myList4.get(i)).length());
	    }
	    return lengths;
	    }
		

		
		// Method 7:
		

		
		// Method 6:
public static List<String>  listWithString(List<String> myList4, String s1)
	
	{
	  
	   
	    myList4.add(s1);
	    return  myList4;
	}
		

		
		// Method 5:
public static String listConcat(List<String> myList4)
	
	{
	 //String str = "";
	 //myList3 = myList3.append(",");
	  //for(int i=0; i<myList3.size(); i++)
	 // {
	    
	//str = str.join(myList3.get(i),",");
	String str = String.join(",", myList4);
	 // }
	  return str;
	}
		
		
		
		// Method 4:
	
public static List<String> switchFirstLast(List<String> myList2)
	
	{
	  
	    String tempString = myList2.get(0);
	    myList2.set(0,myList2.get(myList2.size()-1));
	    myList2.set(myList2.size()-1,tempString);
		
		return myList2;
		
	}
		
		
		
		// Method 3:
	public static String findShortString(List<String> myList1)
	
	{
		String shortElement = myList1.get(0);
		for (int i=0; i<myList1.size(); i++)
		{
			
              if((myList1.get(i)).length() < shortElement.length())
            	 shortElement = myList1.get(i);
		}
		return shortElement;
	}
		
		

	}
