package refactoring.roulette;

import java.util.Set;

public class OddOrEven extends Bet {
    /**
     * Constructs a bet with the given name and odds.
     *
     * @param description name of this kind of bet
     * @param payout
     */
    public OddOrEven(String description, int payout) {
        super(description, payout);
    }

    @Override
    public String process(Set<String> choices) {
        choices.add("even");
        choices.add("odd");
        return ConsoleReader.promptOneOf("Please bet", choices);
    }

    @Override
    public boolean isWin(String betChoice, Wheel myWheel) {
        return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even"))
                || (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }

}
