package Week01Lab;

public class Week01Lab {

	public static void main(String[] args) {
		

				// 1. Create a variable to hold the quantity of 
						//		available plane seats left on a flight
				
				int availableFlightSeat = 10;

						
						// 2. Create a variable to hold the cost of groceries at checkout
				double costOfGrocery = 20.07;

						
						// 3. Create a variable to hold a person's middle initial
				char middleNameInt = 'A';

					
						// 4. Create a variable to hold true if it's hot outside 
						//		and false if it's cold outside
						
				boolean isOutSideHot = true;

						
						// 5. Create a variable to hold a customer's first name
				String customerFirstName = "Ankita";

						
						// 6. Create a variable to hold a street address
				String customerAddress = "321 Lakeside Drive";
						

						// 7. Print all variables to the console
				System.out.println("Available seats left on the plane: " + availableFlightSeat);
				System.out.println("\nCost of groceries at checkout is: $" + costOfGrocery);
				System.out.println("\nCustomer's middle initial is: " + middleNameInt);
				System.out.println("\nIt is hot outside: " + isOutSideHot);
				System.out.println("\nCustomer's first name is: " + customerFirstName);
				System.out.println("\nCustomer street address is: " + customerAddress);
				
				
					
						// 8. A customer booked 2 plane seats, 
						//		remove 2 seats from the available seats variable
				
				availableFlightSeat -= 2;
				System.out.println("\nUpdated available seats left on the plane after 2 seats booked: " + availableFlightSeat);
					
				

						// 9. Impulse candy bar purchase, add 2.15 to the grocery total
						// 		costOfGroceries = costOfGroceries + 2.15;
				 
				 costOfGrocery += 2.15;
				 System.out.println("\nUpdated cost of grocery after purchasing candy of $2.15 is: " + costOfGrocery);
				 


						// 10.  The birth certificate was printed incorrectly, 
						//		change the middle initial to something else
				 middleNameInt='E';
				 System.out.println("\nCustomer's middle initial is: " + middleNameInt);
						

						// 11.  The season has changed, update the hot outside 
						//			variable to be opposite of what it was
				 
				 isOutSideHot=!isOutSideHot;
				 System.out.println("\nIt is hot outside: " + isOutSideHot);

						// 12.  Create a new variable called full name using the customer's first name, 
						//			the middle initial, and a last name of your choice
				 
				 
				 String customerFullName = customerFirstName  + " " +  middleNameInt  + " " + "Aggarwal";
				 System.out.println("\nCustomer's full name is: " + customerFullName);

						// 13.  Print a line to the console that introduces the customer and says they live
						// 			at the address variable

				 System.out.println("\nHello, My name is " + customerFullName + " and I live at " + customerAddress + ".");

			}

		}