package solid.solid_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class ElectricPowerSwitch {

    public LightBulb lightBulb;
    public Fan fan;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb, Fan fan) {

        this.lightBulb = lightBulb;
        this.fan = fan;
        this.on = false;

    }

    public boolean isOn() {

        return this.on;

    }

    public void press() {

        boolean checkOn = isOn();

        if (checkOn) {
            lightBulb.turnOff();
            fan.turnOff();
            this.on = false;

        } else {
            lightBulb.turnOn();
            fan.turnOn();
            this.on = true;
        }
    }
}
