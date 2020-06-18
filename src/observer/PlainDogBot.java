package observer;

class PlainDogBot implements DogBot {
    protected int hungry, tired;
    private String name;

    public PlainDogBot(int h, int t, String name) {
        this.hungry = h;
        this.tired = t;
        this.name = name;
    }

    @Override
    public boolean eat() {
        if (hungry > 6) {
            hungry -= 3;
            return true;
        } else
            return false;
    }

    @Override
    public void rest() {
        hungry++;
        tired -= 2;
    }

    @Override
    public void play() {
        hungry += 2;
        tired += 3;
    }

    @Override
    public String noise() {
        if (hungry > 8 && tired < 11)
            return "whine ";
        else if (tired > 7 && tired > hungry)
            return "snore ";
        else
            return "woof ";
    }

    @Override
    public String getName() {
        return this.name;
    }
}