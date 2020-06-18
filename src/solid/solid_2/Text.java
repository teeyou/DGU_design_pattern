package solid.solid_2;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

class Text {

    private String text;

    private String author;

    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void printText() {
        System.out.println(text);
    }
}
