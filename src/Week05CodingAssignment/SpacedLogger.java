package Week05CodingAssignment;

/*create SpacedLogger class which implement the Logger interface*/
public class SpacedLogger implements Logger {

	/* Log method of SpacedLogger should add spaces between each character of the String 
	 argument passed into the method.
	 */
	
	public void log(String log)
	{
		System.out.println("\nString '" + log + "' with spaces between each character of the String is: ");
		System.out.println(log.replace(""," ").trim());// to give spaces between each character of string

	} // end of method
	
	
	/*Error method of SpacedLogger should print the string with “Error:” preceding and 
	 spaces between each character of the string argument passed into the method.
	 */
	
	public void error(String error)
	{
		System.out.println("\nString '" + error + "' with “Error:” preceding and spaces between each character of the String is: ");
		System.out.println("Error:" +error.replace(""," "));
	} // end of method

}
