import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author GG_B
 * @version 1.0
 */
public class MyCollection extends AbstractCollection {

    private Object[] elements;

    private int size;

    public MyCollection(int capacity){
        elements = new Object[capacity];
    }

    public  MyCollection(){
        this(16);
    }

    @Override
    public Iterator iterator() {
        return new CollectionIterator();
    }

    public boolean add(Object o){
        if (size == elements.length){
            int length = elements.length + elements.length >>1;
            elements = Arrays.copyOf(elements,length);
        }
        elements[size++] = o;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    class CollectionIterator implements Iterator{

        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        public Object next() {
            if (cursor < 0 || cursor >= size){
                throw new IndexOutOfBoundsException("下标越界");
            }
            return elements[cursor++];
        }

        @Override
        public void remove() {
            if (cursor < 0 || cursor >= size){
                throw new IndexOutOfBoundsException("下标越界");
            }
            System.arraycopy(elements,cursor,elements,cursor-1,size-cursor-1);
            if (cursor == size){
                cursor--;
            }
            size--;
        }
    }
}
