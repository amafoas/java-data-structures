package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

  @Test public void testEnqueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    assertEquals(10, queue.front());
    assertEquals(3, queue.size());
  }

  @Test public void testDequeue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    assertEquals(10, queue.dequeue());
    assertEquals(20, queue.dequeue());
    assertEquals(30, queue.dequeue());
    assertEquals(0, queue.size());
  }

  @Test public void testFront() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(10);
    queue.enqueue(20);

    assertEquals(10, queue.front());
    assertEquals(2, queue.size());
  }

  @Test public void testIsEmpty() {
    Queue<Integer> queue = new Queue<>();

    assertTrue(queue.isEmpty());

    queue.enqueue(10);

    assertFalse(queue.isEmpty());
  }

  @Test public void testSize() {
    Queue<Integer> queue = new Queue<>();
    assertEquals(0, queue.size());

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    assertEquals(3, queue.size());

    queue.dequeue();

    assertEquals(2, queue.size());
  }
}
