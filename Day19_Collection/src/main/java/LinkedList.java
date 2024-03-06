/**
 * @author GG_B
 * @version 1.0
 */
public class LinkedList<T> {
    private T data;
    private LinkedList<T> next;

    public LinkedList(T data, LinkedList<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public void setNext(LinkedList<T> next) {
        this.next = next;
    }
}
