package factory;

public class MotorFactory extends Factory {
    @Override
    protected Motor createMotor(String type) {
        if(type.equals("LG"))
            return new LGMotor();
        else if(type.equals("Hyundai"))
            return new HyundaiMotor();
        else
            return null;
    }
}
