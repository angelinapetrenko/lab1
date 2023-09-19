import java.util.Arrays;
/**
 * class MyContainer allows to store an arbitrary number of objects
 */
public class MyContainer<T> implements IMyContainer<T> {
    private Object[] data;
    private int length;
    private int lastElementIndex;
    private final double newSize = 1.5;
    private final int mainSize = 4;
    /**
     * Constructor.
     */
    public MyContainer() {
        this.length = mainSize;
        data = new Object[length];
        this.lastElementIndex = 0;
    }

    /**
     * Method to checking the index
     * @param index - the position of the item
     */
    private void validateIndex(int index)
    {
        if (index < 0 || index >= lastElementIndex)
            throw new IndexOutOfBoundsException("Invalid index");
    }
    /**
     * Method for adding items to the container
     *
     * @param number - added element
     *
     */
    public void add(T number) {
        if (this.lastElementIndex == this.length - 1) {
            this.length *= newSize;
            data = Arrays.copyOf(this.data, this.length);

        }
        this.data[lastElementIndex] = number;
        this.lastElementIndex++;

    }

    /**
     * Method for getting element by index
     * @param index - the position of the item to get
     * @return item by index
     */
    public T get(int index)
    {
        validateIndex(index);
        return (T) data[index];

    }


    /**
     * Method for clearing the container
     */
    public void clearAll() {
        data=null;
        lastElementIndex=0;
        length=mainSize;
    }

    /**
     * Method for removing the item by index
     * @param index - the position of the item to remove
     * @return removed object
     */
    public T removeAt(int index) {
        validateIndex(index);
        this.lastElementIndex--;
        Object temp = data[ index ];
        for (int i = index; i < this.lastElementIndex; i++) {
            this.data[ i ] = this.data[ i + 1 ];
        }

        return (T) temp;

    }

    /**
     *  Method for removing the item by value
     * @param value - the item to remove
     * @return success of the operation
     */
    public boolean remove(T value) {
        for (int i = 0; i < this.lastElementIndex; i++) {
            if(this.data[i]==value)
            {
                while(i<this.lastElementIndex-1){
                    this.data[i] = this.data[i + 1];
                    i++;
                }
                this.lastElementIndex--;
                return true;
            }
        }
        return false;
    }
}