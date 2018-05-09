package DynamicProxyPattern;

public class BarImpl implements Bar {
    public void hello(String s) {
        System.out.println("Bar.hello");
    }

    public void goodbye(String s) {
        System.out.println("Bar.goodbye");
    }
}


