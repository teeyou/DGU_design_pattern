package word_problem_generator.person;

public class PersonFactory {
    public static Person create(String type) {
        if(type.equals("child"))
            return new Child();
        else if(type.equals("parents"))
            return new Parents();
        else
            return null;
    }
}
