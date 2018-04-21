package singletoonPattern_doubleCheking;

public class SingleObject {
    private static SingleObject instance;


    public SingleObject() {
    }

    public static SingleObject getInstance() {
        if (instance == null) {

            synchronized (SingleObject.class) {
                if (instance == null) {
                    instance = new SingleObject();
                }
            }
        }
        return instance;
    }

    public static void showMessage() {
        System.out.println("Testing Singleton Pattern by double cheking");
    }
}




