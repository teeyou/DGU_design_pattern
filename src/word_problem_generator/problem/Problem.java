package word_problem_generator.problem;

public class Problem {
    private String name_first;
    private String name_second;
    private String itemName;
    private int num_first;
    private int num_second;
    private double answer;
    private String imageUrl;

    public Problem(String name_first, String name_second, String itemName, int num_first, int num_second, double answer, String imageUrl) {
        this.name_first = name_first;
        this.name_second = name_second;
        this.itemName = itemName;
        this.num_first = num_first;
        this.num_second = num_second;
        this.answer = answer;
        this.imageUrl = imageUrl;
    }

    public String getName_first() {
        return name_first;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public String getName_second() {
        return name_second;
    }

    public void setName_second(String name_second) {
        this.name_second = name_second;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNum_first() {
        return num_first;
    }

    public void setNum_first(int num_first) {
        this.num_first = num_first;
    }

    public int getNum_second() {
        return num_second;
    }

    public void setNum_second(int num_second) {
        this.num_second = num_second;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void printProblem() {
        //서브클래스에서 오버라이딩
    }
}
