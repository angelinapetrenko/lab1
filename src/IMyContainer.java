public interface IMyContainer<T> {
    void add(T number);
    T get(int index);
    public T removeAt(int index);
    public void clearAll();
    public boolean remove(T value);
}
