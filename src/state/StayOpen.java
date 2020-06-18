package state;

public class StayOpen extends DoorState{
    private static StayOpen instance;

    private StayOpen(Door_1 door) {
        super(door);
    }

    public static DoorState getInstance(Door_1 door) {
        if(instance == null)
            instance = new StayOpen(door);

        return instance;
    }

    @Override
    public void click() {
        door.changeState(Closing.getInstance(door));
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
