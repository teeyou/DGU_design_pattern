package responsibility_chain;

public interface Handler<T> {
    boolean handle(T t);
}