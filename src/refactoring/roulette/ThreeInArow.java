package refactoring.roulette;

import java.util.Set;

public class ThreeInArow extends Bet {
    /**
     * Constructs a bet with the given name and odds.
     *
     * @param description name of this kind of bet
     * @param payout
     */
    public ThreeInArow(String description, int payout) {
        super(description, payout);
    }

    @Override
    public String process(Set<String> choices) {
        return ""
                + ConsoleReader.promptRange(
                "Enter first of three consecutive numbers", 1, 34);
    }

    @Override
    public boolean isWin(String betChoice, Wheel myWheel) {
        int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
}
