package word_problem_generator.person;

import design_pattern.wpg.ProblemGenerator;
import design_pattern.wpg.Scorer;
import design_pattern.wpg.data_source.Repository;
import design_pattern.wpg.ui.type.ConsoleReader;

public class Child extends Person {

    @Override
    public void execute() {
        boolean flag = ProblemGenerator.printProblems();

        if(flag) {
            String answers = inputAnswer();
            String result = Scorer.checkAnswer(answers);
            System.out.println(result);
        } else {
            System.out.println("생성된 문제가 없습니다.");
        }

    }

    public String inputAnswer() {
        StringBuilder sb = new StringBuilder();

        int size = Repository.getInstance().getProbList().size();
        for (int i = 0; i < size; i++) {
            System.out.print(i+1 + "번 문제 답 입력 : ");
            double answer = ConsoleReader.in.nextDouble();
            sb.append(answer).append(" ");
        }

        return sb.toString();
    }
}
