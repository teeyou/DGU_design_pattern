package solid.solid_1;

/*
* 2013112045
* 컴퓨터공학
* 김태웅
*/

public class AreaCalculator{

    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length *rectangle.width;
    }

}

//위 코드를 아래로 변경했을 때 문제발생

class AreaCalculator2 {

    public double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }

    public double calculateCircleArea(Circle circle) {
        return (22 / 7) * circle.radius * circle.radius;
    }
}

