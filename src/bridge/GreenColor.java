package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class GreenColor implements Color {
    private String color;

    public GreenColor() {
        this.color = "green";
    }
    @Override
    public void applyColor() {
        System.out.println(color);
    }
}
