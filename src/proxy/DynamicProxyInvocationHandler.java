package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyInvocationHandler implements InvocationHandler {
    private Subject subject;

    public DynamicProxyInvocationHandler(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(subject, args);
        return null;
    }
}
