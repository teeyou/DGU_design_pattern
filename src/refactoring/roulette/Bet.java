package refactoring.roulette;

import java.util.Set;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
abstract public class Bet {
	
	protected String myDescription;
	protected int myPayout;

	/**
	 * Constructs a bet with the given name and odds.
	 * 
	 * @param description
	 *            name of this kind of bet
	 * @param payout
	 *            payout given by the house for this kind of bet
	 */
	public Bet(String description, int payout) {
		myDescription = description;
		myPayout = payout;
	}

	/**
	 * @return odds given by the house for this kind of bet
	 */
	public int getPayout() {
		return myPayout;
	}

	/**
	 * @return name of this kind of bet
	 */
	public String getDescription() {
		return myDescription;
	}

	abstract public String process(Set<String> choices);
	abstract public boolean isWin(String betChoice, Wheel myWheel);
}
