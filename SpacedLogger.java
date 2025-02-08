package CodingProjectWeek05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		if (log.length() > 0) {
			result.append(log.charAt(0));
			for (int i = 1; i < log.length(); i++) {
				result.append(" ");
				result.append(log.charAt(i));
			}
		}
		System.out.println(result);
		
	} //close log method

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		if (error.length() > 0) {
			result.append(error.charAt(0));
			for (int i = 1; i < error.length(); i++) {
				result.append(" ");
				result.append(error.charAt(i));
			}
		}
		System.out.println("\nERROR: " + result);
		
	} //close error method

} //close class
