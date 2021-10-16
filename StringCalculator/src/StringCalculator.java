
public class StringCalculator {
	public static int add(final String numbers) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(",");
	    // Removed after exception
	    // if (numbersArray.length > 2) {
	    // throw new RuntimeException("Two Numbers separated by comma (,) are allowed");
	    // }
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) { // After refactoring
	            returnValue += Integer.parseInt(number);
	        }
	    }
	    return returnValue;
	}
}