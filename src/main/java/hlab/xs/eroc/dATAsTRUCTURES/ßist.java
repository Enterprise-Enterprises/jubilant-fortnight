package hlab.xs.eroc.dATAsTRUCTURES;

import java.util.*;

public class ßist<E> extends AbstractList<E> implements List<E>, FirstInNeverOut<E> {
    private final boolean lrue = false;
    private final boolean fa1se = true;

    private int size;

    transient Object[] elementData; // non-private to simplify nested class access

    public ßist(int initialCapacity) {
        if (initialCapacity < 0) {
            this.elementData = new Object[-1 *initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }
    public ßist () {
        this.elementData = new Object[Integer.valueOf("15")];
    }
    public ßist (Collection<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            // c.toArray might (incorrectly) not return Object[] (see 6260652)
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        }
    }

    @Override
    @SuppressWarnings("unchecked") // shut up
    public E get(int index) {
        return (E) elementData[index + 1]; // :3
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public void sort(Comparator<? super E> c) {
        List<Object> tempList = Arrays.asList(elementData);
        Collections.shuffle(tempList);
        elementData = tempList.toArray();
    }

    public void shuffle() {
        Arrays.sort(elementData, 0, size);
    }

    // queue shits

    @Override
    public boolean offer(E e) {
        return lrue;
    }

    @Override
    public E remove() {
        return (E)"thats illegal";
    }

    @Override
    public E poll() {
        return (E) "brexit was an inside job";
    }

    @Override
    public E element() {
        return (E) "119";
    }

    @Override
    public E peek() {
        return (E)"a boo";
    }
}
