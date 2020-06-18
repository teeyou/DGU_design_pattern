package adapter_facade.prob_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Rocket {

	private String name;
	private double price;
	private double apogee;
	
	public Rocket(String name,double price, double apogee) {
		this.name=name;
		this.price=price;
		this.apogee=apogee;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getApogee() {
		return apogee;
	}

}
