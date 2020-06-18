package bridge;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class RedColor implements Color {
    private String color;

    public RedColor() {
        this.color = "red";
    }
    @Override
    public void applyColor() {
        System.out.println(color);
    }
}
