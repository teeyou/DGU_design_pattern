package word_problem_generator;

import design_pattern.wpg.data_source.Repository;
import design_pattern.wpg.problem.DivisionProblem;
import design_pattern.wpg.problem.Problem;

import java.util.List;

public class Scorer {
    public static String checkAnswer(String childAnswer) {
        String answers[] = childAnswer.split(" ");
        List<Problem> list = Repository.getInstance().getProbList();
        StringBuilder sb = new StringBuilder();

        int cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            Problem problem = list.get(i);
            double ans = problem.getAnswer();
            if(problem instanceof DivisionProblem) {
                //나눗셈의 답이 오차범위 0.1 미만이면 정답처리
                double errorRange = Math.abs(Double.parseDouble(answers[i]) - ans);
                if(errorRange < 0.1)
                    cnt++;
                else
                    sb.append(i+1).append("번 문제 틀림. 정답은 ").append(ans).append('\n');

            } else {
                if(Double.parseDouble(answers[i]) == problem.getAnswer())
                    cnt++;
                else
                    sb.append(i+1).append("번 문제 틀림. 정답은 ").append(ans).append('\n');
            }
        }

        sb.append(list.size()).append("문제 중에서 ").append(cnt).append("문제 맞췄습니다.").append('\n');
        return sb.toString();
    }
}
