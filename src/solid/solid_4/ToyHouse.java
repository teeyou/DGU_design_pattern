package solid.solid_4;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class ToyHouse implements Toy {
    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
