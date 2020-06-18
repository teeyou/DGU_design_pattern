package proxy;

class Proxy implements Subject{

    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    public Object action() {
        System.out.println("Proxy action");
        return realSubject.action();
    }
}