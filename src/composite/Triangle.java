package composite;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Triangle implements Shape {
    public Triangle() {

    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
