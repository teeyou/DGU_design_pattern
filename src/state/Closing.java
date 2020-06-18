package state;

public class Closing extends DoorState{
    private static Closing instance;

    private Closing(Door_1 door) {
        super(door);
    }

    public static DoorState getInstance(Door_1 door) {
        if(instance == null)
            instance = new Closing(door);

        return instance;
    }

    @Override
    public void click() {
        door.changeState(Opening.getInstance(door));
    }

    @Override
    public void complete() {
        door.changeState(Closed.getInstance(door));
    }

    @Override
    public void timeout() {
        //아무것도 없음
    }
}
