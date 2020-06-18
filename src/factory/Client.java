package factory;

public class Client {
    public static void main(String[] args) {
//        Motor lgMotor = new LGMotor();

        Factory factory = new MotorFactory();
        Motor motor1 = factory.create("LG");
        ElevatorController controller1 = new ElevatorController(1, motor1);

        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

//        Motor hyundaiMotor = new HyundaiMotor();

        Motor motor2 = factory.create("Hyundai");
        ElevatorController controller2 = new ElevatorController(1, motor2);
        controller2.gotoFloor(4);

        controller2.gotoFloor(6);
    }
}
