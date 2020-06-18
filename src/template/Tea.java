package template;

public class Tea extends CaffeineBeberage{

    @Override
    public void doBrewOrSteep() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void doAddIngredients() {
        System.out.println("Adding Lemon");
    }
}
