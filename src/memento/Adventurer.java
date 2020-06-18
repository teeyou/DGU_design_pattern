package memento;

import java.util.List;

public class Adventurer {
    private int HP;
    private int MP;
    private List<Item> items;
    private Map map;
    private Position position;

    public Adventurer(int HP, int MP, List<Item> items, Map map, Position position) {
        this.HP = HP;
        this.MP = MP;
        this.items = items;
        this.map = map;
        this.position = position;
    }

    public Memento createMemento() {
        Memento memento = new Memento(this.HP, this.MP, this.position, this.map, this.items);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.HP = memento.getHP();
        this.MP = memento.getMP();
        this.items = memento.getItems();
        this.map = memento.getCurrentMap();
        this.position = memento.getPosition();
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
