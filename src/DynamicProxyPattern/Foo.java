package DynamicProxyPattern;
public class Foo {
    public static void main(String[] args) {

        // bar 의 메소드 실행
        Bar bar = new BarImpl();
        bar.hello("hello");
        bar.goodbye("goodbye");

        System.out.println("======================================");

        // 추가적인 메세지가 출력됨
        // Proxy : 실제로 구현하는 클래스와 같은 기능을 하면서, 추가적인 기능을 가지고 있음
        // 결과를 보면 Proxy로 만들어진 Bar 인터페이스의 메써드가 호출될 때마다 invoke 메써드가 호출됨
        Bar proxy = (Bar) TraceProxy.newInstance(new BarImpl());
        proxy.hello("hello");
        proxy.goodbye("goodbye");
    }
}







