class MyArray {

    private int[] array;
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void insert(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }

    public void insertAfter(int afterValue, int value) {

        int index = search(afterValue);

        if (index == -1) {
            System.out.println("Value not found");
            return;
        }

        insert(index + 1, value);
    }

    public void updateByValue(int oldValue, int newValue) {

        int index = search(oldValue);

        if (index == -1) {
            System.out.println("Value not found");
            return;
        }

        array[index] = newValue;
    }

    public void deleteByValue(int value) {

        int index = search(value);

        if (index == -1) {
            System.out.println("Value not found");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

public class Main1 {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(10);

        myArray.insert(0, 10);
        myArray.insert(1, 20);
        myArray.insert(2, 30);

        myArray.insertAfter(20, 25);

        myArray.updateByValue(30, 35);

        myArray.deleteByValue(25);

        int index = myArray.search(20);

        System.out.println("Index of 20: " + index);

        myArray.display();
    }
}