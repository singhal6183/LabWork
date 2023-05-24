package practice;


public class practice {

	public static void main(String[] args) {
		
	/*Create an array of int called ages that contains the 
		following values: 3, 9, 23, 64, 2, 8, 28, 93.*/

	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
	/* Print each element of Array*/
	
	  System.out.println("Elements of array ages[] =:");
	  for (int i=0; i < ages.length; i++)
	  {
	  System.out.println(ages[i]);
      }
	
    /*subtract the value of the first element in the array 
	  from the value in the last element of the array*/
	
		int subVal = ages[(ages.length-1)] - ages[0];
		System.out.println("\nDifference of first and last element in ages[] =: " + subVal);
	
	/* calculate the average age */
		
		int sum =0;
		for (int i=0; i < ages.length; i++)
		{
		   sum =  sum + ages[i];
		}
		int averageVal = sum / ages.length;
		System.out.println("\nCalculate average age through out the array: " + averageVal);
		
	    /*2. Create String array that contains the 
	        following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob” */
	    
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
	    /*2 a) calculate the average number of letters per name */
		
		int sumarr =0;
		for (int i=0; i < names.length; i++)
		{
			sumarr += names[i].length();
		}
		int average = sumarr / names.length;
		System.out.println("\nThe average number of letters per name in names[] = " + average );
		
		/*2 b) concatenate all the names together, separated by spaces */
		String str = "";
		for (int i=0; i < names.length; i++)
		{
		  str = str.concat(" ").concat(names[i]);
		  
		}
		//String str1 = String.join(" ", names);
		System.out.println("\nAll names in array are together: " + str);
		
		/*3.  Access the First element of any array */
		System.out.println("\nFirst element of array names[]= " + names[0]);
		
		
		/*4.  Access the Last element of any array */
		System.out.println("\nLast element of array names[]= " + names[names.length-1]);
		
		
		/*5.	Create a new array of int called nameLengths. 
		 Write a loop to iterate over the previously created names array 
		 and add the length of each name to the nameLengths array.
		 */
		int[] nameLengths = new int[names.length];
		for (int i=0; i < names.length; i++)
				{
			nameLengths[i] = names[i].length();
				 
				}
		System.out.println("\nElements in new array nameLengths[] are: ");
		for (int count=0; count < nameLengths.length; count++)
		{
		System.out.println(nameLengths[count]);
		}
		
		/*6. Calculate the sum of all the elements in the array nameLengths  */
		
		System.out.println("\nSum of all the elements in the array nameLengths[] =: ");
		 int sum1 = 0;
		 for (int i: nameLengths)
		 {
			 sum1 = sum1 + i;
			 
		 }
		 System.out.println(sum1);
		
	
	    /*7. Write a method that takes a String, word, and an int, n, as arguments 
	         and returns the word concatenated to itself n number of times */
		 
	     String resultStr = concatString("Welcome", 3);
	     System.out.println("\nGiven String is concatenated to itself: " + resultStr);
	     
	    /* 8. Write a method that takes two Strings, firstName 
	     and lastName, and returns a full name */
	     
	     String fullName = makeFullName("Ankita","Aggarwal");
	     System.out.println("\nFullName after combining First and Last name: " + fullName);
	     
	    /* 9.	Write a method that takes an array of int and returns true 
	     if the sum of all the ints in the array is greater than 100.*/
	     
	     int[] intArray = {25,45,18,65};
	     boolean isHundred = sumOfArray(intArray);
	     System.out.println("\nSum of all the ints in the array is greater than 100: " + isHundred);
	    
	    /*10. Write a method that takes an array of double and returns the 
	     average of all the elements in the array. */
	     
	     double[] doubleArr = {25.4,45.3,6.4,7.52};
	     double sumDouble = sumOfDoubleArray(doubleArr);
	     //System.out.println("\nSum of all double values in the array is: " + sumDouble);   
	     System.out.println("\nSum of all double values in the array is: " + String.format("%f", sumDouble));        
	
	    /* 11. Write a method that takes two arrays of double and returns 
	     true if the average of the elements in the first array is greater
	      than the average of the elements in the second array.*/
	     
	     double[] doubleArr1 = {65.4,3.3,62.4,7.52};
	     boolean avgGreater = avgOfTwoDoubleArray(doubleArr, doubleArr1);
	     System.out.println("\nAverage of first array is greater than second array: " + avgGreater);
	
	    /* 12.	Write a method called willBuyDrink that takes a 
	     boolean isHotOutside, and a double moneyInPocket, and returns true 
	     if it is hot outside and if moneyInPocket is greater than 10.50.*/
	     
	     boolean val = willBuyDrink( true, 10.45);
	     System.out.println("\nIs hot outside and moneyInPocket is greater than 10.50: " + val);
	
	     /*13. Write a method to find odd and even numbers in a integer array */
	     
	     findEvenOdd(ages);
	
	
	}	

 /*   -------------------------   METHODS -------------------------------*/
	
	/*7. Write a method that takes a String, word, and an int, n, as arguments 
    and returns the word concatenated to itself n number of times */
	
	public static String concatString(String word, int n)
 
 {   String str = "";
	 for (int index =1; index<=n; index++)
	 {
		 str = str.concat(word);
	 }
	 return str;
	 
 }  // End of Method
	
	/* 8. Write a method that takes two Strings, firstName 
    and lastName, and returns a full name */
	
	public static String makeFullName(String fword, String lword)
	 
	 {  
	        String str = fword.concat(" ").concat(lword);
		    return str;
		    
	 } // End of Method
	
	 /* 9.	Write a method that takes an array of int and returns true 
    if the sum of all the ints in the array is greater than 100.*/
	
	public static boolean sumOfArray(int[] arr)
	 
	 {      int sum =0;
	        for(int i: arr)
	        { 
	        	sum = sum +i;
	        }
	        return sum > 100;
	        
	 }   // End of Method
	
	 /*10. Write a method that takes an array of double and returns the 
    average of all the elements in the array. */
	
	public static double sumOfDoubleArray(double[] arr)
	 
	 {      double sum =0.0;
	        for(double i: arr)
	        { 
	        	sum = sum +i;
	        }
	        double avgValue = sum / arr.length;
	        return avgValue;
	        
	 } // End of Method
	

    /* 11. Write a method that takes two arrays of double and returns 
     true if the average of the elements in the first array is greater
      than the average of the elements in the second array.*/
	
	public static boolean avgOfTwoDoubleArray(double[] arr1, double[] arr2)
	 
	 {      double sum1 =0.0;  
	        for(double i: arr1)
	        { 
	        	sum1 = sum1 +i;
	        }
	        double avgValue1 = sum1 / arr1.length;   // average of first array
	        
	        double sum2 =0.0;
	        for(double j: arr2)
	        { 
	        	sum2 = sum2 +j;
	        }
	        double avgValue2 = sum2 / arr2.length;   // average of second array
	        
	        return avgValue1 >avgValue2;
	        
	 }  // End of Method
	
	/* 12.	Write a method called willBuyDrink that takes a 
    boolean isHotOutside, and a double moneyInPocket, and returns true 
    if it is hot outside and if moneyInPocket is greater than 10.50.*/
	
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
    	if( isHotOutside && moneyInPocket > 10.50)
    	{
    		return true;
    	}
    	return false;
    	
    }     // End of method
    
    /*13. Write a method to find odd and even numbers in a integer array */
    
    public static void findEvenOdd(int[] arr)
    {
    	System.out.println("\nEven number in given array:");
    	for(int i: arr)
    	{
    		if(i % 2 ==0)
    		{ System.out.println(i);
    		}
   
    	}
    	
    	System.out.println("\nOdd number in given array:");
    	for(int i: arr)
    	{
    		if(i % 2!= 0)
    		{ System.out.println(i);
    		}
   
    	}
    	
    	
    	} // End of Method
    	
    }
   

