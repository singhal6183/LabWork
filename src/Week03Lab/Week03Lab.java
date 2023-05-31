package Week03Lab;

public class Week03Lab {


	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
		int[] arr = {1,5,2,8,13,6};

		
		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");
		System.out.println("First Element of Array is: " + arr[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");
		int arrLength = arr.length;
		System.out.println("Last Elelment of Array is: " + arr[arrLength -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4:");
		System.out.println("Elelment of Array at position 6th: " + arr[5]);
		
		
		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5:");
		//System.out.println("Elelment of Array at position -1: " + arr[-1]);
		
			
		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		System.out.println("Elements of Array:");
		for (int i=0; i < arr.length; i++)
		{
		System.out.println(arr[i]);
	    }
		
			
		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
		System.out.println("Elements of Array:");
		for (int i: arr)
		{
		System.out.println(i);
	    }
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("\nQuestion 8:");
		int sum = 0;
		for (int i: arr)
		{
		sum = sum + i;
	    }
			System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it

			System.out.println("\nQuestion 9:");
			int avg = sum / arrLength;
				System.out.println(avg);
				
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
				System.out.println("\nQuestion 10:");
				for (int i: arr)
				{
				if( i % 2 != 0)
					System.out.println(i);
			    }
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
				System.out.println("\nQuestion 11:");
				System.out.println("Elements of string Array");
				String[] arrStr = {"Sam", "Sally", "Thomas", "Robert"};
				for(String name: arrStr)
				{ System.out.println(name);
				}
	
		
		// 12. Calculate the sum of all the letters in the new array

				System.out.println("\nQuestion 12:");
				int sumStr =0;
				for (int i=0; i< arrStr.length; i++)
				{
					sumStr= sumStr + arrStr[i].length();
				}
              System.out.println(sumStr);
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
              
         System.out.println("\nQuestion 13:");
		 StringGreet1("Hello1");
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		 
		System.out.println("\nQuestion 14:");
		String greet =  StringGreet2("Hello2");
		System.out.println(greet);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println("\nQuestion 15: isStringLongerThanNumber");
		boolean val1 = testMethod1("HelloWorld", 5);
		System.out.println(val1);
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println("\nQuestion 16: isStringMatchingInArray");
		//String[] arrStr = {"Sam", "Sally", "Thomas", "Robert"};
		System.out.println(testMethod2(arrStr, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		
		System.out.println("\nQuestion 17: smallestNumberInArray");
		//int arr = {1,5,2,8,13,6};
		int result = testMethod3(arr);
		System.out.println(result);
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		System.out.println("\nQuestion 18: ArrayOfDoubleValues");
		double[] doubleArr = {1.6,5.34,2.43,8.2,3.7,13.67,6.0};
		//double avgResult = testMethod4(doubleArr);
		System.out.println(testMethod4(doubleArr));
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		System.out.println("\nQuestion 19: ExtractStringLength");
		//String[] arrStr = {"Sam", "Sally", "Thomas", "Robert"};
		int[] integerArray = testMethod5(arrStr);
		for (int integerNumber: integerArray)
		{ System.out.println(integerNumber);
		}

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println("\nQuestion 20: HasMoreEvenWordCharacters");
		String[] arrEvenOdd = {"Sam", "Sally", "Thomas", "Robert","Maina","Eric","Paindela"};
		System.out.println(testMethod6(arrEvenOdd));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("\nQuestion 21: Is String 'radar' Palindrome");
		System.out.println(testMethod7("radar"));
		
		
	}
	

	
	// Method 13:
	 public static void StringGreet1(String s)
	 {
	 System.out.println(s);
	 }
	// Method 14:
	 public static String StringGreet2(String s)
	 {
	 return s;
	 }
	
	// Method 15:
	 public static boolean testMethod1(String s, int i)
	 {
	    return s.length() > i;
	
	 }
	
	// Method 16:
	 public static boolean testMethod2(String[] array, String str)
	 {
		 
		 for (int i=0; i<array.length; i++)
		 { 
		 if(array[i] == str)
		 return true;
		 } return false;
	 }
	

	
	// Method 17:
	public static int testMethod3(int[] arr1)
	 {
		 int smallest = arr1[0];
		 for (int number: arr1)
		 { 
		 if(number < smallest)
		  smallest = number;
		 } return smallest;
	 } 

	
	// Method 18:
	
	public static double testMethod4(double[] doubleArray)
	 {
	     double sum =0.0;
		 for (double number: doubleArray)
		 { 
		  sum = sum + number;
		 } 
		 double doubleAvg = sum/doubleArray.length;
		 return doubleAvg;
	 } 

	
	// Method 19:
	
	public static int[] testMethod5(String[] strArr)
	 {
		int[] ArrLength = new int[strArr.length];
		 for (int i=0; i<strArr.length; i++)
		 { 
		  ArrLength[i]= strArr[i].length();
		  
		 } 
		 
		 return ArrLength;
	 } 

	
	// Method 20:
	public static boolean testMethod6(String[] strArr)
	 { 
		int strLength1 =0;
		int strLength2 =0;
		 for (int i=0; i<strArr.length; i++)
		 { 
		  if(strArr[i].length() % 2 == 0)
		  strLength1 = strLength1 + strArr[i].length();
		  else
		  strLength2 = strLength2 + strArr[i].length();  
		 } 
		 if(strLength1 > strLength2)
		 {return true;
		 }
		 return false;
	 } 
	
	
	// Method 21:
	public static boolean testMethod7(String str7)
	 { 
		
		for (int i = 0; i < str7.length() / 2; i++) {
			if (str7.charAt(i) != str7.charAt(str7.length() - i - 1)) {
				return false;
			}
		}
		return true;
	 } 

}
