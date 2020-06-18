package solid.solid_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class LightBulb {
    private boolean state;

    public LightBulb() {
        this.state = false;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void turnOn() {
        this.state = true;
        System.out.println("LightBulb: Bulb turned on...");

    }

    public void turnOff() {
        this.state = false;
        System.out.println("LightBulb: Bulb turned off...");
    }
}
