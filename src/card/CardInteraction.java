package card;

/*
*  2013112045
*  컴퓨터공학
*  김태웅
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class CardInteraction {
    private Scanner scanner;
    private CardOrder card;

    private static final String ERROR_MESSAGE_NAME_INPUT = "Please Enter <=28 chars and contains at least one space";
    private static final String ERROR_MESSAGE_QUANTITY_INPUT = "Please Enter between 1 and 1000";
    private static final String INPUT_MESSAGE_NAME = "Enter name: ";
    private static final String INPUT_MESSAGE_QUANTITY = "How many cards would you like? ";
    private static final String INPUT_MESSAGE_OK_BORDER = "Enter \"OK\" if this card is ok, \notherwise enter an alternative border character: ";
    private static final String CARD_DISPLAY_MESSAGE = "Here is a sample card:";

    public CardInteraction() {
        scanner = new Scanner(System.in);
    }

    //runs the program as follows:
    //Gets details of card name from user
    //Displays card
    //Repeatedly, until user responds ok
    //	Asks the user if they would like to change the border
    //	If so, change the border and print the new card
    //Print the price of the order
    //print whether a discount is applicable or not
    public void run() {
        //Alter this gradually to add more details
//		card.CardOrder order = new card.CardOrder("Jane Black");

        card = new CardOrder(getNameFromUser());

        System.out.println();

        displayCard(card);

        checkBorder();

        System.out.println();

        card.setNumCards(getNumberFromUser());

        printCost();
    }

    //repeatedly requests and reads name from user
    //until valid (i.e. <=28 chars and contains at least one space
    //finally returns the valid text
    private String getNameFromUser() {
        //use this value until more code written
        String name;
        while (true) {
            System.out.print(INPUT_MESSAGE_NAME);
            name = scanner.nextLine();
            name = name.trim(); //앞뒤 공백 자르기

            if (name.contains(" ") && name.length() <= 28)
                break;

            else
                System.out.println(ERROR_MESSAGE_NAME_INPUT);
        }

        return name;
    }

    //repeatedly requests and reads number from user
    //until valid number entered i.e. between 1 and 1000
    //finally returns the valid number
    private int getNumberFromUser() {
        //use this number until more code written
        int quantity;
        while (true) {
            System.out.print(INPUT_MESSAGE_QUANTITY);
            quantity = scanner.nextInt();
            if (1 <= quantity && quantity <= 1000) {
                break;
            } else {
                System.out.println(ERROR_MESSAGE_QUANTITY_INPUT);
                System.out.println();
            }
        }

        return quantity;
    }

    private void displayCard(CardOrder order) {
        System.out.println(CARD_DISPLAY_MESSAGE);
        System.out.println();
        System.out.print(order.getSampleCard());
        System.out.println();
    }

    private void checkBorder() {
        while(true) {
            String input;
            System.out.print(INPUT_MESSAGE_OK_BORDER);
            input = scanner.next();
            if (input.equals("OK") || input.equals("ok")) {
                break;
            } else {
                card.setBorder(input.charAt(0));
                displayCard(card);
            }
        }
    }

    private void printCost() {
        String total = new DecimalFormat("#,###").format(card.getFinalCost());
        String cnt = new DecimalFormat("#,###").format(card.getNumCards());

        System.out.println("The price of " + cnt + " cards is " + total + " won.");

        if (card.getNumCards() >= CardOrder.DISCOUNT_QUANTITY)
            System.out.println((int)(CardOrder.DISCOUNT_RATE * 100) + "% discount applied");
        else
            System.out.println("No discount given");
    }
}


