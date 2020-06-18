package factory;

public abstract class Factory {
    public Motor create(String type) {
        Motor motor = createMotor(type);
        return motor;
    }
    protected abstract Motor createMotor(String type);
}
