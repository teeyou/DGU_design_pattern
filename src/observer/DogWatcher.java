package observer;

import java.util.Observable;
import java.util.Observer;

class DogWatcher implements Observer {
    private String name;

    DogWatcher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DogBot) {
            DogBot dog = (DogBot) o;
            System.out.println(name + " : " + dog.getName() + " " + arg);
        }
    }
}