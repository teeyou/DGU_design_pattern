package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class TestBridgePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        Shape penta = new Pentagon(new GreenColor());

        tri.applyColor();
        penta.applyColor();
    }
}
