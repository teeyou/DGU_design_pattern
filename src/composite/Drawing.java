package composite;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    private List<Shape> shapes;

    public Drawing() {
        shapes = new ArrayList<>();
    }

    @Override
    public void draw(String color) {
        for(Shape shape : shapes) {
            shape.draw(color);
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void remove(Shape shape) {
        shapes.remove(shape);
    }

    public void clear() {
        shapes.clear();
        System.out.println("Clearing all the shapes from drawing");
    }
}
