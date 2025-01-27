package mrChibuzor.queue.src.queue;

public class Queue {
    private int size;
    private String[] elements;

    public Queue(int size) {
        elements = new String[size];
    }


    public void enqueue(String element) {
        if (size != elements.length) elements[size++] = element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String element(int i) {
        return elements[i];
    }

    public int size() {
        return elements.length;
    }

    public void dequeue() {
        String[] newElements = new String[elements.length];
        elements[0] = null;
        for (int i = 1; i < size; i++) {
            if (elements[i] != null) {
                newElements[i-1] = elements[i];
            }
        }
        elements = newElements;
        size--;
    }

    public String peek() {
        return elements[0];
    }
}
