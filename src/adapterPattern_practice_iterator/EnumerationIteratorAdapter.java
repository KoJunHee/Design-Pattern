package adapterPattern_practice_iterator;

public class EnumerationIteratorAdapter implements Iterator{
    Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void hasNext() {
        enumeration.hasMoreElements();
    }

    @Override
    public void next() {
        enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}



