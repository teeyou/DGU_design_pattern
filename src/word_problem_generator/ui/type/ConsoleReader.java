package word_problem_generator.ui.type;


import design_pattern.wpg.data_source.Repository;

import java.util.Scanner;

public class ConsoleReader {
    private static Repository repo = Repository.getInstance();
    public static Scanner in = new Scanner(System.in);

    public static String printSelectMode() {
        System.out.print("UI 모드 입력 CLI / GUI : ");
        return in.next();
    }

    public static void printInputName() {
        System.out.println("이름을 입력. 그만 입력 : 1");
        while(true) {
            String name = in.next();
            if(name.equals("1"))
                break;
            repo.getNameList().add(name);
        }
    }

    public static void printInputItem() {
        System.out.println("항목을 입력. 그만 입력 : 1");
        while(true) {
            String item = in.next();
            if(item.equals("1"))
                break;
            repo.getItemList().add(item);
        }
    }

    public static String printInputOperation() {
        in.nextLine(); //next() 이후 skip 되는 것을 피하기 위해 사용
        System.out.print("연산자를 입력 + , - , * , / : ");
        return in.nextLine();
    }

    public static int printInputProblemCount() {
        System.out.print("생성할 문제 수를 입력 : ");
        return in.nextInt();
    }

    public static int printInputNumberRangeMin() {
        System.out.print("최소 숫자 범위 입력 : ");
        return in.nextInt();
    }

    public static int printInputNumberRangeMax() {
        System.out.print("최대 숫자 범위 입력 : ");
        return in.nextInt();
    }
}
