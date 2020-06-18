package state;

public abstract class DoorState {
    protected Door_1 door;

    public DoorState(Door_1 door) {
        this.door = door;
    }

    public abstract void click();
    public abstract void complete();
    public abstract void timeout();
}
