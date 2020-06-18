package word_problem_generator.ui.type;

public class UIFactory {
    public static UI create(String type) {
        if(type.equals("CLI"))
            return new CLI();
        else if(type.equals("GUI"))
            return new GUI();
        else
            return null;
    }
}
