package adapterPattern;

public class Main {
    public static void main(String[] args) {

        MyDuck myDuck = new MyDuck();
        MyTurkey myTurkey = new MyTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(myTurkey);

        System.out.println("****Turkey****");
        myTurkey.gobble();
        myTurkey.fly();

        System.out.println("****Duck****");
        testDuck(myDuck);

        System.out.println("****TurkeyAdapter****");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}



