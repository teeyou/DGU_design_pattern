package proxy;

class RealSubject implements Subject {

    public RealSubject(){}

    public Object action() {
        System.out.println("RealSubject action");
        return null;
    }
}
