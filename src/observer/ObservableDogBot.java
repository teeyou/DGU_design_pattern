package observer;

import java.util.Observable;

class ObservableDogBot extends Observable implements DogBot {
    private DogBot dogBot;

    public ObservableDogBot(DogBot dog) {
        dogBot = dog;
    }

    @Override
    public boolean eat() {
        if (dogBot.eat()) {
            setChanged();
            notifyObservers("eat");
            return true;
        } else
            return false;
    }

    @Override
    public void rest() {
        dogBot.rest();
        setChanged();
        notifyObservers("rest");
    }

    @Override
    public void play() {
        dogBot.play();
        setChanged();
        notifyObservers("play");
    }

    @Override
    public String noise() {
        return dogBot.noise();
    }

    @Override
    public String getName() {
        return dogBot.getName();
    }
}