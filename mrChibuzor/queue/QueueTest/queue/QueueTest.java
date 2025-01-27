package mrChibuzor.queue.QueueTest.queue;

import mrChibuzor.queue.src.queue.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue(3);
    }

    @Test
    public void testQueue() {
        queue.enqueue("boy");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void queueISEmpty_testQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addXY_getX_testQueue() {
        queue.enqueue("boy");
        queue.enqueue("girl");
        assertEquals("girl", queue.element(1));
        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());
    }

    @Test
    public void addXY_removeX_checkQueueSize_testQueue() {
        queue.enqueue("boy");
        queue.enqueue("girl");
        queue.dequeue();
        assertEquals(3, queue.size());
        assertEquals("girl", queue.element(0));
    }

    @Test
    public void addXY_peekX_testQueue() {
        queue.enqueue("table");
        queue.enqueue("boy");
        queue.enqueue("girl");
        assertEquals("table", queue.peek());
        queue.dequeue();
        assertEquals("boy", queue.peek());
        queue.dequeue();
        queue.dequeue();
        assertEquals(null, queue.peek());
    }

}