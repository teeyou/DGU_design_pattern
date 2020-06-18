package memento;

import java.util.List;

public class Memento {
    private int HP;
    private int MP;
    private Position position;
    private Map currentMap;
    private List<Item> items;

    public Memento(int HP, int MP, Position position, Map currentMap, List<Item> items) {
        this.HP = HP;
        this.MP = MP;
        this.position = position;
        this.currentMap = currentMap;
        this.items = items;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(Map currentMap) {
        this.currentMap = currentMap;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
