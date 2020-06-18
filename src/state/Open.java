package state;

public class Open extends DoorState{
    private static Open instance;

    private Open(Door_1 door) {
        super(door);
    }

    public static DoorState getInstance(Door_1 door) {
        if(instance == null)
            instance = new Open(door);

        return instance;
    }

    @Override
    public void click() {
        door.changeState(StayOpen.getInstance(door));
    }

    @Override
    public void complete() {
        //아무것도 없음
    }

    @Override
    public void timeout() {
        door.changeState(Closing.getInstance(door));
    }
}
