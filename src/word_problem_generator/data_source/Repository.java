package word_problem_generator.data_source;

import design_pattern.wpg.problem.Problem;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository repo;
    private static List<Problem> probList;
    private static List<String> nameList;
    private static List<String> itemList;

    private Repository() {
        probList = new ArrayList<>();
        nameList = new ArrayList<>();
        itemList = new ArrayList<>();

    }

    public static Repository getInstance() {
        if(repo == null)
            repo = new Repository();

        return repo;
    }

    public List<Problem> getProbList() {
        return probList;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public List<String> getItemList() {
        return itemList;
    }
}
