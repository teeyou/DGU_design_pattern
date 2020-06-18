package composite;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Circle implements Shape {
    public Circle() {

    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing Circle with color " + color);
    }
}
