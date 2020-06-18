package solid.solid_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Fan {
    private boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void turnOn() {
        this.state = true;
        System.out.println("Fan turned on...");

    }

    public void turnOff() {
        this.state = false;
        System.out.println("Fan turned off...");
    }
}
