package prototype;

public class MessageBox implements Product {
    private char ch;

    public MessageBox(char ch) {
        this.ch = ch;
    }

    @Override
    public void use(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(ch).append(s).append(ch);

        System.out.println(sb.toString());
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
