package word_problem_generator;

import design_pattern.wpg.ui.type.ConsoleReader;
import design_pattern.wpg.ui.type.UI;
import design_pattern.wpg.ui.type.UIFactory;

public class Main {

    public static void main(String[] args) {

        String mode = ConsoleReader.printSelectMode();
        UI ui = UIFactory.create(mode);

        ui.run();
    }
}
