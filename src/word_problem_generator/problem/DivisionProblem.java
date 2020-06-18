package word_problem_generator.problem;

public class DivisionProblem extends Problem {

    public DivisionProblem(String name_first, String name_second, String item, int num_first, int num_second, double answer, String imageUrl) {
        super(name_first, name_second, item, num_first, num_second, answer, imageUrl);
    }

    @Override
    public void printProblem() {
        System.out.printf("%s은/는 %s을 %d 개 가지고 있습니다. (그/그녀)는 %d 명의 친구에게 똑같이 나누어 주고 싶습니다.\n" +
                "각각 %s을/를 몇 개씩 가지게 되나요?",
                this.getName_first(), this.getItemName(), this.getNum_first(), this.getNum_second(), this.getItemName());
    }
}
