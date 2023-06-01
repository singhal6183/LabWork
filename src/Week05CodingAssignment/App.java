package Week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1 = new AsteriskLogger();
		logger1.log("Hello");
		logger1.error("Hello");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Welcome");
		logger2.error("Welcome");
		
	}

}
