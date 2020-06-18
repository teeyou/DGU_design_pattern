package refactoring.roulette;

import java.util.Set;

public class RedOrBlack extends Bet {
    /**
     * Constructs a bet with the given name and odds.
     *
     * @param description name of this kind of bet
     * @param payout
     */
    public RedOrBlack(String description, int payout) {
        super(description, payout);
    }

    @Override
    public String process(Set<String> choices) {
        choices.add(Wheel.BLACK);
        choices.add(Wheel.RED);
        return ConsoleReader.promptOneOf("Please bet", choices);
    }

    @Override
    public boolean isWin(String betChoice, Wheel myWheel) {
        return myWheel.getColor().equals(betChoice);
    }


}
