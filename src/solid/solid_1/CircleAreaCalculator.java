package solid.solid_1;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class CircleAreaCalculator implements ICalculateCircleArea {

    @Override
    public double calculateCircleArea(Circle circle) {
        return (22 / 7) * circle.radius * circle.radius;
    }
}
