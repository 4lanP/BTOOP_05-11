public class Block<T> {
    private T item;
    private boolean isEmpty;

    public Block() {
        this.isEmpty = true;
    }

    public void addItem(T item) {
        if (!isEmpty) {
            throw new IllegalStateException("Block is already occupied!");
        }
        this.item = item;
        this.isEmpty = false;
    }

    public T removeItem() {
        if (isEmpty) {
            throw new IllegalStateException("Block is empty!");
        }
        T removedItem = this.item;
        this.item = null;
        this.isEmpty = true;
        return removedItem;
    }

    public void displayInfo() {
        if (isEmpty) {
            System.out.println("Block is empty");
        } else {
            System.out.println("Block contains: " + item.toString());
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}