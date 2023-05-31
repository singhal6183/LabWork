package Week05lab;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger logger1 = new AsteriskLogger();
		logger1.log("Hello");
		logger1.error("Hello");
		
		SpacedLogger logger2 = new SpacedLogger();
		logger2.log("Welcome");
		logger2.error("Welcome");
		
	}

}
