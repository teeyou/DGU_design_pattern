package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class Pentagon extends Shape {
    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}
