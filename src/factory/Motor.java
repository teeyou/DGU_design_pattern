package factory;

enum Direction {UP, DOWN}

enum MotorStatus {MOVING, STOPPING}

public abstract class Motor {

    private MotorStatus motorStatus;

    public Motor() {

        motorStatus = MotorStatus.STOPPING;

    }

    public MotorStatus getMotorStatus() {

        return motorStatus;

    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }


    public void move(Direction direction) {

        MotorStatus motorStatus = getMotorStatus();

        if (motorStatus == MotorStatus.MOVING)
            return;

        moveMotor(direction);

        setMotorStatus(MotorStatus.MOVING);

    }

    abstract void moveMotor(Direction direction);

    public void stop() {
        setMotorStatus(MotorStatus.STOPPING);
    }
}
