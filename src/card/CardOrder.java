package card;

/**
 * OOP Assignment One
 * card.CardOrder class keeps details of one card order
 * and provides methods to print a card
 * and determine the price
 */

/*
 *  2013112045
 *  컴퓨터공학
 *  김태웅
 */


public class CardOrder {
    private Name name;    //the name printed on the card
    private char border;    //the card border
    private int numCards;   //the number of cards to be printed

    private static final int CARD_LEN = 32;  //the length of the card in characters

    private static final int LIMIT_LEN = 12;    //추가요금 기준이 되는 이름 길이
    private static final int BASE_COST = 40;    //기본요금
    private static final int EXTRA_COST = 50;   //LIMIT_LEN 이상일 시 요금

    public static final int DISCOUNT_QUANTITY = 200;
    public static final double DISCOUNT_RATE = 0.10;

    //initialises name from value in parameter
    //and sets other instance variables to suitable default values
    //you can create a card.Name from a single string after L5
    //If you want to start before then, just write name = new card.Name("A", "B", "C") in the constructor!
    public CardOrder(String fullName) {
        String[] name_split = fullName.split(" ");

        if(name_split.length == 2)
            this.name = new Name(name_split[0] , name_split[1]); //First , Last
        else if(name_split.length == 3)
            this.name = new Name(name_split[0], name_split[1], name_split[2]); //First , Middle, Last

        this.border = '*';
        this.numCards = 0;
    }

    ///////////////////////////////////////////
    //accessor/mutator methods

    //returns the character used in the border
    public char getBorder() {
        return this.border;
    }

    //sets the character used in the border
    //to that provided in the parameter
    public void setBorder(char ch) {
        this.border = ch;
    }

    //returns the name
    public Name getName() {
        return this.name;
    }

    //sets the name used in the card
    //to that provided in the parameter
    public void setName(Name name) {
        this.name = name;
    }

    //returns the number of cards to be printed
    public int getNumCards() {
        return this.numCards;
    }

    //sets the number of cards to be printed
    //to that provided in the parameter
    public void setNumCards(int n) {
        this.numCards = n;
    }
    ///////////////////////////////////////////

    //returns a sample card, including a newline at the end of each line
    public String getSampleCard() {
        return getTopLine() + getBlankLine() + this.getLineWithName()
                + getBlankLine() + getTopLine();
    }

    //returns a String containing the top or bottom line
    //of a card, including a newline character at the end
    private String getTopLine() {
        //use this value until more code written
        StringBuilder sb = new StringBuilder();
        sb.append(name.getInits()); //맨 앞에 이니셜 세팅

        //border char 세팅
        int init_len = name.getInits().length();
        for (int i = 0; i < CARD_LEN - (init_len * 2); i++) {
            sb.append(border);
        }

        sb.append(name.getInits()).append('\n'); //맨 뒤에 이니셜 세팅후 개행문자 추가
        return sb.toString();
    }

    //returns a String containing the blank line
    //of a card, with a border char at each end
    //and including the newline character
    private String getBlankLine() {
        //use this value until more code written
        StringBuilder sb = new StringBuilder();
        sb.append(border);
        for (int i = 0; i < CARD_LEN - 2; i++) {
            sb.append(" ");
        }
        sb.append(border).append('\n');
        return sb.toString();
    }

    //returns a String containing the name line
    //of a card, including name, padding and border
    //and including the newline character
    private String getLineWithName() {
        //use this value until more code written

        StringBuilder sb = new StringBuilder();
        sb.append(name.getFirstName()).append(" ");
        if(name.getMiddleName() != null)
            sb.append(Character.toUpperCase(name.getMiddleName().charAt(0))).append(" ");
        sb.append(name.getLastName());

        String fullName = sb.toString();
        int lenWithBorder = fullName.length() + 2;
        int spaceLength = CARD_LEN - lenWithBorder;
        boolean even = true;
        if(spaceLength % 2 != 0)
            even = false;


        sb.delete(0, sb.length());

        sb.append(border);

        if(even) { //공백이 짝수개면 앞 뒤 동일하게 공백 넣음
            for (int i = 0; i < spaceLength / 2; i++) {
                sb.append(" ");
            }

        } else { //공백이 홀수개면 앞에 하나 더 넣음
            for (int i = 0; i < spaceLength / 2 + 1; i++) {
                sb.append(" ");
            }
        }

        sb.append(fullName);

        for (int i = 0; i < spaceLength / 2; i++) {
            sb.append(" ");
        }

        sb.append(border).append('\n');
        return sb.toString();
    }

    //returns the price of one card
    //in pounds (i,e either 0.20 or 0.25)
    //based on the number of characters in the name to be printed
    //0.20 if <=12 otherwise 0.25
    public double getCardPrice() {
        //use this value until more code written
        StringBuilder sb = new StringBuilder();
        sb.append(name.getFirstName()).append(" ");
        if(name.getMiddleName() != null)
            sb.append(Character.toUpperCase(name.getMiddleName().charAt(0))).append(" ");
        sb.append(name.getLastName());

        String fullName = sb.toString();

        int len = fullName.length(); //MiddleName이 존재하면 print 되는 MiddleName은 1글자로 카운트

        if(name.getMiddleName() == null)
            len -= 1; //First Last 사이 공백길이 제거
        else
            len -= 2; //First Middle Last 사이 공백길이 제거

        if(len <= LIMIT_LEN)
            return BASE_COST;
        else
            return EXTRA_COST;
    }

    //returns the final cost of the order
    //which is the number of cards multiplied by the card price
    //and reduced by 10% if >= 100 cards
    public double getFinalCost() {
        //use this value until more code written
        double price = getCardPrice() * numCards;
        if(hasDiscount())
            price *= (1 - DISCOUNT_RATE);

        return price;
    }

    //returns true if number of cards < 100, false otherwise
    public boolean hasDiscount() {
        if(numCards >= DISCOUNT_QUANTITY)
            return true;
        else
            return false;
    }
}
