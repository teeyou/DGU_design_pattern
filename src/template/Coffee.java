package template;

public class Coffee extends CaffeineBeberage{
    @Override
    public void doBrewOrSteep() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void doAddIngredients() {
        System.out.println("Adding Sugar and Milk");
    }
}
