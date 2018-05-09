package DynamicProxyPattern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TraceProxy implements java.lang.reflect.InvocationHandler {

    private Object obj;

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new TraceProxy(obj));
    }

    private TraceProxy(Object obj) {
        this.obj = obj;
    }

    // Proxy가 BarImpl의 메써드가 호출될 때
    // 그 앞에서 Intercept해서 다른 추가적인 작업을 진행할 수 있다.
    // 각 메써드가 호출되기 전과 후에 특정 메세지를 Logging할 때는 좋음
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            System.out.print("begin method " + m.getName() + "(");
            for (int i = 0; i < args.length; i++) {
                if (i > 0)
                    System.out.print(",");
                System.out.print(" " + args[i].toString());
            }
            System.out.println(" )");
            result = m.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: "
                    + e.getMessage());
        } finally {
            System.out.println("end method " + m.getName());
        }
        return result;
    }
}
