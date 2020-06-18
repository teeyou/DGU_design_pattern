package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
