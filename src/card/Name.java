package card;

/*
 *  2013112045
 *  컴퓨터공학
 *  김태웅
 */

//Basics 3
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    private static final String MIDDLE_NAME_NULL_MESSAGE = "MiddleName is NULL";

    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
    }

    public Name(String fName, String lName) {
        firstName = fName;
        middleName = null;
        lastName = lName;
    }

    public String getInits() {
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(firstName.charAt(0)));
        if(middleName != null)
            sb.append(Character.toUpperCase(middleName.charAt(0)));
        sb.append(Character.toUpperCase(lastName.charAt(0)));

        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        if(middleName != null)
            return middleName;
        else
            return MIDDLE_NAME_NULL_MESSAGE;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public void setMiddleName(String mn) {
        middleName = mn;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getFirstAndLastName() {
        return firstName + " " + lastName;
    }

    public String getLastCommaFirst() {
        return lastName + ", " + firstName;
    }

//    public String getFullName() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(firstName).append(" ");
//        if(middleName != null)
//            sb.append(Character.toUpperCase(middleName.charAt(0))).append(" ");
//        sb.append(lastName);
//
//        return sb.toString();
//    }

}

