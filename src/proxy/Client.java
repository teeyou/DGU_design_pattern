package proxy;

//public class Client {
//    public static void main(String[] args) {
//        Subject subject = new Proxy();
//        subject.action();
//    }
//}

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        DynamicProxyInvocationHandler proxy = new DynamicProxyInvocationHandler(new RealSubject());

        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, proxy);
        subject.action();
    }
}