package state;

public class Closed extends DoorState{
    private static Closed instance;

    private Closed(Door_1 door) {
        super(door);
    }

    public static DoorState getInstance(Door_1 door) {
        if(instance == null)
            instance = new Closed(door);

        return instance;
    }

    @Override
    public void click() {
        door.changeState(Opening.getInstance(door));
    }

    @Override
    public void complete() {
        //아무것도 없음
    }

    @Override
    public void timeout() {
        //아무것도 없음
    }
}
