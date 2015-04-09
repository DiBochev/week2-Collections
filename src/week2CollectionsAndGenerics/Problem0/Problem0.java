package week2CollectionsAndGenerics.Problem0;

public class Problem0 {

	public boolean isCorrectBackets(String expression){
		int counter = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				counter++;
			}
			if (expression.charAt(i) == ')') {
				counter--;
			}
			if (counter < 0) {
				return false;
			}
		}
		return counter == 0;
	}
}
