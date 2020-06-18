package refactoring.roulette;

import java.util.Set;
import java.util.TreeSet;

/**
 * Plays a game of roulette.
 * 
 * @author Robert C. Duvall
 */
public class Game {
	// name of the game
	private static final String DEFAULT_NAME = "Roulette";
	public static final String SPINNING = "Spinning ...";
	public static final String CONGRATULATIONS_YOU_WIN = "*** Congratulations :) You win ***";
	public static final String SORRY_YOU_LOSE = "*** Sorry :( You lose ***";
	public static final String TYPES_OF_BETS = "You can make one of the following types of bets:";

	private Wheel myWheel;
	private Bet[] myPossibleBets = {
			new RedOrBlack("Red or Black", 2),
			new OddOrEven("Odd or Even", 1),
			new ThreeInArow("Three in a Row", 11)
	};

	/**
	 * Construct the game.
	 */
	public Game() {
		myWheel = new Wheel();
	}

	/**
	 * @return name of the game
	 */
	public String getName() {
		return DEFAULT_NAME;
	}

	/**
	 * Play a round of this game.
	 * 
	 * For Roulette, this means prompting the player to make a bet, spinning the
	 * roulette wheel, and then verifying that the bet is won or lost.
	 * 
	 * @param player
	 *            one that wants to play a round of the game
	 */
	public void play(Gambler player) {
		int amount = ConsoleReader.promptRange("How much do you want to bet",
				0, player.getBankroll());
		int whichBet = promptForBet();
		String betChoice = placeBet(whichBet);

		System.out.print(SPINNING);

		myWheel.spin();
		System.out.println("Dropped into " + myWheel.getColor() + " "
				+ myWheel.getNumber());

		if (betIsMade(whichBet, betChoice)) {
			System.out.println(CONGRATULATIONS_YOU_WIN);
			amount *= myPossibleBets[whichBet].getPayout();
		} else {
			System.out.println(SORRY_YOU_LOSE);
			amount *= -1;
		}
		player.updateBankroll(amount);
	}

	/**
	 * Prompt the user to make a bet from a menu of choices.
	 */
	private int promptForBet() {
		System.out.println(TYPES_OF_BETS);
		for (int k = 0; k < myPossibleBets.length; k++) {
			System.out.println((k + 1) + ") "
					+ myPossibleBets[k].getDescription());
		}

		return ConsoleReader.promptRange("Please make a choice", 1,
				myPossibleBets.length) - 1;
	}

	/**
	 * Place the given bet by prompting the user for the specific information
	 * need to complete the given bet.
	 * 
	 * @param whichBet
	 *            specific bet chosen by the user
	 */
	private String placeBet(int whichBet) {

		Set<String> choices = new TreeSet<>();
		String result = myPossibleBets[whichBet].process(choices);

		System.out.println();

		return result;
	}

	/**
	 * Checks if the given bet is won or lost given the user's choice and the
	 * result of spinning the wheel.
	 * 
	 * @param whichBet
	 *            specific bet chosen by the user
	 * @param betChoice
	 *            specific value user chose to try to win the bet
	 */
	private boolean betIsMade(int whichBet, String betChoice) {
		return myPossibleBets[whichBet].isWin(betChoice, myWheel);

	}
}
