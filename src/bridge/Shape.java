package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public abstract class Shape {
    protected Color color;

    public Shape(Color c) {
        this.color = c;
    }

    public abstract void applyColor();
}
