package responsibility_chain;

public interface Chain<T> {
    void handle(T t);
}
