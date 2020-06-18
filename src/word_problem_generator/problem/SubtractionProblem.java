package word_problem_generator.problem;

public class SubtractionProblem extends Problem {

    public SubtractionProblem(String name_first, String name_second, String item, int num_first, int num_second, double answer, String imageUrl) {
        super(name_first, name_second, item, num_first, num_second, answer, imageUrl);
    }

    @Override
    public void printProblem() {
        System.out.printf("%s은/는 %s을 %d 개 가지고 있습니다. %s은/는 %s에게 %s %d 개를 주었습니다.\n" +
                        "%s에게 몇 개의 %s 이/가 남았습니까?",
                this.getName_first(), this.getItemName(), this.getNum_first(),
                this.getName_first(), this.getName_second(), this.getItemName(), this.getNum_second(),
                this.getName_first(), this.getItemName());
    }
}
