package templateMethodPattern02;

public class Tea extends CaffeineBeberage {

    @Override
    void beforePouring() {
        System.out.println("Steeping the tea");

    }

    @Override
    void afterPouring() {
        System.out.println("Adding lemon");

    }
}
