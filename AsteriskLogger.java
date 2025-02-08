package CodingProjectWeek05;

public class AsteriskLogger implements Logger {
	
	
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}
	
	
	public static String asteriskLine(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append("*");
	}
		
		return sb.toString();
		
	} 
	
	@Override
	public void error(String error) {	
		String starLine = asteriskLine(error.length());
		System.out.println("\n**********" + starLine + "***");
		System.out.println("***Error: " + error + "***");	
		System.out.println("**********" + starLine + "***");
	}
	
			
	} //close class
