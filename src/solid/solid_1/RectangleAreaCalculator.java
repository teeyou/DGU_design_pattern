package solid.solid_1;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class RectangleAreaCalculator implements ICalculateRectangleArea {
    @Override
    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
