package templateMethodPattern02;

public class Client {
    public static void main(String[] args) {
        CaffeineBeberage caffeineBeberage = new Coffee();
        caffeineBeberage.prepareRecipe();
        System.out.println();
        caffeineBeberage= new Tea();
        caffeineBeberage.prepareRecipe();
    }
}
