package Week05lab;

/*create AsteriskLogger class which implement the Logger interface*/
public class AsteriskLogger implements Logger {

	/*log method on the AsteriskLogger should print out the String
	   between 3 asterisks on either side of the String argument passed into the method
	*/
	
	public void log(String log) 
	{
		System.out.println("String '" + log + "' with 3 asterisks on either side of string is: ");
		System.out.println("***" +log+ "***");

	} // end of log method
	
	
	/* The error method on the AsteriskLogger should print the String 
	  inside a box of asterisks, with the String preceded by the word “ERROR:”
	*/
	
	public void error(String error)
	{
		
		System.out.println("\nString '" + error + "' inside a box of asterisks is: ");
		for(int i=1; i<=error.length()+13; i++) // for loop to print top line of asterisks
		{
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("***Error: " +error+ "***");
		
		for(int i=1; i<=error.length()+13; i++) // for loop to print bottom line of asterisks
		{
			System.out.print("*");
		}
		System.out.println();
	} // end of method

}
