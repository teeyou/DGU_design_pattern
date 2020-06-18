package word_problem_generator.problem;

public class ProblemFactory {

    public static Problem create(String type, String name_first, String name_second, String itemName,
                                 int num_first, int num_second, double answer, String url) {

        if(type.equals("+")) {
            answer = num_first + num_second;
            return new AdditionProblem(name_first, name_second, itemName, num_first, num_second, answer, null);
        } else if(type.equals("-")) {
            answer = num_first - num_second;
            return new SubtractionProblem(name_first, name_second, itemName, num_first, num_second, answer, null);
        } else if(type.equals("*")) {
            answer = num_first * num_second;
            return new MultiplicationProblem(name_first, name_second, itemName, num_first, num_second, answer, null);
        } else if(type.equals("/")) {
            answer = (double)num_first / num_second;
            return new DivisionProblem(name_first, name_second, itemName, num_first, num_second, answer, null);
        } else
            return null;
    }
}
