package card;

/*
 *  2013112045
 *  컴퓨터공학
 *  김태웅
 */

//Basics 5
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Name n1 = new Name("Jane", "Black");
		System.out.println(n1.getFirstName());
		System.out.println(n1.getMiddleName());
		System.out.println(n1.getLastName());
		System.out.println(n1.getInits() + " " + n1.getFirstAndLastName());
		System.out.println(n1.getLastCommaFirst());
		System.out.println();
		
		Name n2 = new Name("Mary", "Ann", "Smith");
		System.out.println(n2.getFirstName());
		System.out.println(n2.getMiddleName());
		System.out.println(n2.getLastName());
		System.out.println(n2.getInits() + " " + n2.getFirstAndLastName());
		System.out.println(n2.getLastCommaFirst());
		System.out.println();

		CardOrder co = new CardOrder("Jonathan Peter Macdonald");
		System.out.println(co.getName().getFirstAndLastName());
		System.out.println(co.getName().getMiddleName());
		System.out.println(co.getName().getInits());
		System.out.println(co.getBorder());
		System.out.println(co.getNumCards());
		System.out.println("SampleCard Print");
		System.out.println(co.getSampleCard());

		System.out.println("------------------");

		co.setName(new Name("Kim", "Tae","Ung"));
		co.setBorder('+');
		co.setNumCards(200);
		System.out.println(co.getName().getFirstAndLastName());
		System.out.println(co.getName().getMiddleName());
		System.out.println(co.getName().getInits());
		System.out.println(co.getBorder());
		System.out.println(co.getNumCards());

		System.out.println("SampleCard Print");
		System.out.println(co.getSampleCard());

		System.out.println("----------------------");
		System.out.println(co.getFinalCost());

	}

}
