import java.util.Arrays;

public class MyArray {

    private String[] newArray;
    private String[] array;
    private int size;
    private int currentIndex;

    public MyArray(int size) {
        this.array = new String[size];
        this.size = size;
    }

    public void insert(String value, int position) {
        if (position < 0 || position >= size) throw new IndexOutOfBoundsException("Invalid position");
        shiftFrom(position, value);
    }

    public void shiftFrom(int position, String value) {
        newArray = new String[array.length];

        for (int i = 0; i < newArray.length; i++) {
            if (i < position) {
                newArray[i] = array[i];
            }
            else if (i == position) {
               newArray[i] = value;
            }
            else {
                newArray[i] = array[i - 1];
            }
        }
        array = newArray;
    }


    public void push(String value) {
        if (currentIndex == size) throw new IndexOutOfBoundsException("out of bounds");

        if (array[currentIndex] == null) {
            array[currentIndex++] = value;
        }
        else {
            while (array[currentIndex] != null) {
                currentIndex++;
            }
            array[currentIndex++] = value;
        }
    }

    public String pop() {
        if (currentIndex == 0) throw new IndexOutOfBoundsException("out of bounds");
        String value = array[currentIndex];
        array[--currentIndex] = null;
        return value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        return Integer.parseInt(array[index]);
    }

    public boolean contains(String value) {
        for (String number : array) {
            if (number != null && number.equals(value)) return true;
        }
        return false;
    }

    public boolean isEmpty() {
        for (String element : array) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        myArray.insert("1", 1);



        System.out.println(Arrays.toString(myArray.array));
        System.out.println(myArray.isEmpty());
        System.out.println(myArray.contains("2"));
    }
}
