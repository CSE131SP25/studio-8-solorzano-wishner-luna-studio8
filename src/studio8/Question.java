package studio8;

import support.cse131.NotYetImplementedException;

public class Question {

	/**
	 * Constructor
	 * 
	 * @param prompt
	 * @param answer
	 * @param points
	 */
	private String prompt2;
	private String answer2;
	private int points2;

	public Question(String prompt, String answer, int points) {
		prompt2 = prompt;
		answer2 = answer;
		points2 = points;

	}

	/**
	 * Prints out the current question's prompt, with a parenthetical number of
	 * points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt2 + "(" + this.points2 + " points)");
	}

	/**
	 * Check the answer provided by a user
	 * 
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if (answer2.equals(givenAnswer)) { // String comparison
			return this.points2;
		} else {
			return 0;
		}
	}

	/**
	 * Getter method for the points possible
	 * 
	 * @return int points
	 */
	public int getPoints() {
		return points2;
	}

	/**
	 * Getter method for the answer to the question
	 * @return String answer
	 */
	public String getAnswer() {
		return answer2;
	}

	public static void main(String[] args) {
		Question q = new Question("who is your favorite","michelle",5);

	}
}
