package word_problem_generator.person;

import design_pattern.wpg.ProblemGenerator;
import design_pattern.wpg.ui.type.ConsoleReader;

public class Parents extends Person {

    @Override
    public void execute() {
        ConsoleReader.printInputName();
        ConsoleReader.printInputItem();
        String operation = ConsoleReader.printInputOperation();
        int count = ConsoleReader.printInputProblemCount();
        int min = ConsoleReader.printInputNumberRangeMin();
        int max = ConsoleReader.printInputNumberRangeMax();

        ProblemGenerator.generate(operation, count, min, max);

    }
}
