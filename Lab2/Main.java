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

    public void update(int index, int value) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        array[index] = value;
    }

    public void delete(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(10);

        myArray.insert(0, 10);
        myArray.insert(1, 20);
        myArray.insert(2, 30);

        myArray.update(1, 25);

        myArray.delete(0);

        myArray.display();
    }
}