package word_problem_generator.ui.type;

import design_pattern.wpg.person.Person;
import design_pattern.wpg.person.PersonFactory;

public class CLI extends UI{
    @Override
    public void run() {
        while(true) {
            Person person = selectUser();
            if(person == null)
                break;

            person.execute();
        }

    }

    @Override
    public Person selectUser() {
        System.out.print("child / parents 중에 입력 (프로그램 종료 : 1) : ");
        String user = ConsoleReader.in.next();
        if(user.equals("1"))
            return  null;

        return PersonFactory.create(user);
    }
}
