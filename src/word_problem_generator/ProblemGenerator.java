package word_problem_generator;

import design_pattern.wpg.data_source.Repository;
import design_pattern.wpg.problem.Problem;
import design_pattern.wpg.problem.ProblemFactory;

import java.util.List;

public class ProblemGenerator {
    public static int generateRandomNumber(int min, int max) {
        return (int)(Math.random() * (max-min + 1) + min);
    }

    public static int generateRandomNameIndex(List<String> nameList , int alreadyNum) {
        int num;
        do {
            num = (int)(Math.random() * nameList.size());
        }while(num == alreadyNum); //2명의 인물이 동일인물 일 경우에 다시 뽑음

        return num;
    }

    public static String generateRandomItemName(List<String> itemList) {
        int num = (int)(Math.random() * itemList.size());
        return itemList.get(num);
    }

    public static void generate(String operation, int count, int min, int max) {
        List<String> nameList = Repository.getInstance().getNameList();
        List<String> itemList = Repository.getInstance().getItemList();
        List<Problem> probList = Repository.getInstance().getProbList();
        probList.clear();   //문제를 다시 생성할 때 기존에 만들었던 문제를 모두 지움, name과 item은 지우지 않고 재사용

        int cnt = count;

        if(nameList.size() > 0 && itemList.size() > 0) {
            String operations[] = operation.split(" "); //operation을 여러개 입력했을 때 split를 이용해서 자름

            //각 operation 별로 생성할 문제 수 만큼 문제를 만듦
            for (int i = 0; i < operations.length; i++) {
                count = cnt;
                while(count-- > 0) {
                    int index = generateRandomNameIndex(nameList, -1); //먼저 뽑은 이름과 중복을 피하기 위한 index
                    String name1 = nameList.get(index);
                    String name2 = nameList.get(generateRandomNameIndex(nameList, index));

                    String itemName = generateRandomItemName(itemList);

                    int itemNum1 = generateRandomNumber(min, max);
                    int itemNum2 = generateRandomNumber(min, max);

                    Problem problem = ProblemFactory.create(operations[i],name1, name2, itemName, itemNum1, itemNum2, 0, null);
                    probList.add(problem);
                }
            }
        } else {
            System.out.println("입력된 이름 또는 항목이 부족합니다.");
            System.out.println("입력된 이름 : " + nameList.size());
            System.out.println("입력된 항목 : " +itemList.size());
        }
    }

    public static boolean printProblems() {
        List<Problem> list = Repository.getInstance().getProbList();

        if(list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.print(i + 1 + ". ");
                list.get(i).printProblem();
                System.out.println();
                System.out.println();
            }
            return true;
        } else
            return false;
    }
}
