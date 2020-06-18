package word_problem_generator.problem;

public class AdditionProblem extends Problem {
    public AdditionProblem(String name_first, String name_second, String item, int num_first, int num_second, double answer, String imageUrl) {
        super(name_first, name_second, item, num_first, num_second, answer, imageUrl);
    }

    @Override
    public void printProblem() {
        System.out.printf("%s은/는 %s을 %d 개 가지고 있습니다. %s은/는 %s을 %d 개 가지고 있습니다.\n" +
                "그들이 가지고 있는 %s은/는 모두 몇 개입니까?",
                this.getName_first(), this.getItemName(), this.getNum_first(),
                this.getName_second(), this.getItemName(), this.getNum_second(),
                this.getItemName());
    }
}
