package template;

public abstract class CaffeineBeberage {

    public abstract void doBrewOrSteep();
    public abstract void doAddIngredients();

    public void prepareRecipe() {
        boilWater();
        doBrewOrSteep();
        pourInCup();
        doAddIngredients();
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
