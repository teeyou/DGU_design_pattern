package state;

public class Opening extends DoorState {
    private static Opening instance;

    private Opening(Door_1 door) {
        super(door);
    }

    public static DoorState getInstance(Door_1 door) {
        if(instance == null)
            instance = new Opening(door);

        return instance;
    }

    @Override
    public void click() {
        door.changeState(Closing.getInstance(door));
    }

    @Override
    public void complete() {
        door.changeState(Open.getInstance(door));
    }

    @Override
    public void timeout() {
        //아무것도 없음
    }
}
