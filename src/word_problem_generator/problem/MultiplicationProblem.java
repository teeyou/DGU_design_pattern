package word_problem_generator.problem;

public class MultiplicationProblem extends Problem {

    public MultiplicationProblem(String name_first, String name_second, String item, int num_first, int num_second, double answer, String imageUrl) {
        super(name_first, name_second, item, num_first, num_second, answer, imageUrl);
    }

    @Override
    public void printProblem() {
        System.out.printf("%s은/는 %d 개의 %s을/를 %d 묶음 가지고 있습니다. %s은/는 전부 %s 이/가 몇 개입니까?",
                this.getName_first(), this.getNum_first(), this.getItemName(), this.getNum_second(),
                this.getName_first(), this.getItemName());
    }
}
