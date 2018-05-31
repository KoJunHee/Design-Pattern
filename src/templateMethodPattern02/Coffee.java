package templateMethodPattern02;

public class Coffee extends CaffeineBeberage {
    @Override
    void beforePouring() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void afterPouring() {
        System.out.println("Adding sugar and milk");
    }
}
