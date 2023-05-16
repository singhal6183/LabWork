package Week02Lab;

public class Week02Lab {

	public static void main(String[] args) {
		
				
				// 1. Variable Declaration:
				//		a. Create a variable named age and assign it a value of 14

				int age = 14;
				
				// 2. Print a Boolean Expression:
				//		a. Print the boolean expression age >= 16 to the console and note the results.
				//		a. Change the value of age to 18 and print again.
				System.out.println("\nAnswer of Question 2");
                System.out.println(age >= 16);
                age = 18;
                System.out.println(age >= 16);
                
				
				// 3. Can you drive?
				//		a. Using a conditional, print one of the following:
				//				i. "You can drive" if age is greater than or equal to 16
				//				ii. "You cannot drive" otherwise
				//
				//		a. Change the value of age and rerun to see the result
                
            System.out.println("\nAnswer of Question 3");  
			if(age >= 16)
			  {
                  System.out.println("You can Drive");
                  
			  }
			else
			  {
				  System.out.println("You can not Drive");
			  }
				
				// 4. Update Solution to Question 3 as follows:
				//		a. Add a new variable called hasLicense before the conditional.
				//		b. Change the boolean expression in the conditional to additionally 
				//				include the need for hasLicense to be true.
				//		c. Try changing the values of age and hasLicense and note the different results.
			System.out.println("\nAnswer of Question 4");
			boolean hasLicense = false;
			
			if(age >= 16 && hasLicense)
			  {
                System.out.println("You can Drive");
                
			  }
			else
			  {
				  System.out.println("You can not Drive");
			  }
			
				
				// 5. Milk?
				//		a. Create two new variables - costOfMilk and thirstLevel
				//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
				//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
				//		c. Change the values and note the different results.
			System.out.println("\nAnswer of Question 5");
			double costOfMilk = 2.06;
			int thristLevel = 7;
			if(costOfMilk <= 2.50 || thristLevel >=6)
			  {
				System.out.println("MIlk Please");
			   }
			else
			 {
				System.out.println("No Thanks");
			 }

			
				
				// 6. Cookie Distribution: 
				//			Note:  You will evenly distribute all of the cookies to the children 
				//					and as the adult you get to keep the remaining cookies for yourself.
				//
				//		a. Create two variables called numberOfCookies and numberOfChildren.
				//		b. Initialize the two variables to integer values.
				//		b. Use a conditional to print the following based on the following conditions:
				//				i. If there are 0 cookies remaining, print "Sad Face"
				//				ii. If there are less than 2 cookies, print "Yes!"
				//				iii. If there are less than 5 cookies, print "Whoohoooo!"
				//				iv. If there are 5 or more cookies, print "Jackpot!"


		     System.out.println("\nAnswer of Question 6");
		     int numberOfCookies = 27;
		     int numberOfChildren  = 12;
		     int remainingCookies = numberOfCookies % numberOfChildren;
		          if(remainingCookies == 0)
		          {
		        	  System.out.println("Sad Face");
		          }
		          else if(remainingCookies < 2)
		          {
		        	  System.out.println("Yes");
		          }
		          else if(remainingCookies < 5 && remainingCookies
		        		  >= 2)
		          {
		        	  System.out.println("WOOOHOOO");
		          }
		          else
		        	  System.out.println("JackPot!");
						
				// 7.  Loyalty Member Program:
				//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
				//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
				//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
				//				the following loyaltyMemberStatus scale: 
				//				i. "SILVER" is 0.10
				//				ii. "GOLD" is 0.15
				//				iii. "PLATINUM" is 0.25
		          
		       System.out.println("\nAnswer of Question 7");
				String loyaltyMemberStatus = "SILVER";
				double loyaltyMemberDiscount = 0.0;
				
				switch (loyaltyMemberStatus) {

			    case "SILVER":

			    	loyaltyMemberDiscount = 0.10;
	
                    break;

			    case "GOLD":

			    	loyaltyMemberDiscount = 0.15;

			        break;

			    case "PLATINUM":

			    	loyaltyMemberDiscount = 0.25;

				}
				System.out.println(loyaltyMemberDiscount);

				
				// 8. Using the Loyalty Member Program variables from Question 7, do the following:
				//		a. Create a variable called billTotal and assign a value
				//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
				//				the loyaltyMemberDiscount percent of the billTotal
				//		c. If the adjustedBillTotal is greater than $500 upgrade the 
				//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
		       
		       System.out.println("\nAnswer of Question 8");
               double billTotal = 2.34;
               double adjustedBillTotal =( billTotal - ((billTotal*100)/loyaltyMemberDiscount));
               System.out.println(adjustedBillTotal);
       		
       		if (adjustedBillTotal > 500) {
       			if (loyaltyMemberStatus == "SILVER") {
       				loyaltyMemberStatus = "GOLD";
       			} else if (loyaltyMemberStatus == "GOLD") {
       				loyaltyMemberStatus = "PLATINUM";
       			}
       		}
       		
       		System.out.println(loyaltyMemberStatus);
				
				// 9. Login -- username & password:
				//		a. Create two variables, username and password
				//		b. Create a conditional that prints one of the following:
				//				i. "login successful" if the username is "Tommy123" and the password is "12345"
				//				ii. "access denied" otherwise
		          
		          System.out.println("\nAnswer of Question 9");
		          String userName = "Tommy123";
		          String passWord = "12345";
		          if(userName.equals("Tommy123") && passWord.equals("12345"))
		          {
		        	  System.out.println("Login Sucessful");
		          }
		          else
		          {
		        	  System.out.println("Access Denied");
		          }
				
				
				//
				// LOOPS:
				//
				
				// 10. Write a for loop that prints each number from 0 to 9
			
			     System.out.println("\nAnswer of Question 10");
			for (int a=0; a <10; a++)
			{
				 System.out.println(a);
			}

				
				
				// 11. Write a for loop that prints each number from 10 to 0 backwards
			
			     System.out.println("\nAnswer of Question 11");
			for (int x=10; x >=0; x--)
			{
				 System.out.println(x);
			}

				
				
				// 12. Write a for loop that prints every other number from 0 to 100

			System.out.println("\nAnswer of Question 12");
			for (int i=0; i <=100; i=i+2)
			{
				 System.out.println(i);
			}
			
			
				// 13. Write a for loop that iterates from 0 to 100 and prints 
				//			"EVEN" if the number is even and "ODD" if it's odd
			System.out.println("\nAnswer of Question 13");
			for (int i=0; i <=100; i++)
			{
				if(i % 2 == 0)
				  {
				System.out.println("\nEVEN NUMBER: " + i);
				  }
				else
				  {
				System.out.println("\nODD NUMBER: " + i);
				  }	
			}

				
				
				// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
				//			within the loop, divide each number by 3 and print the remainder to the console.

			System.out.println("\nAnswer of Question 14");
			int i = 100;
			while ( i >= 0 )
			
			{
				System.out.println("\nRemainder of The Number " + i + " is " + i % 3);
				i--;
				  
			}

				
			}

		}