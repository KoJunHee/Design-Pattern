package templateMethodPattern02;

public abstract class CaffeineBeberage {
    abstract void beforePouring();
    abstract void afterPouring();

    public void boilWater(){
        System.out.println("Boiling Water");

    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public final void prepareRecipe(){
        boilWater();
        beforePouring();
        pourInCup();
        afterPouring();
    }

}
