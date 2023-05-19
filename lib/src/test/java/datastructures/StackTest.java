package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  @Test public void testPush() {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    assertEquals(30, stack.peek());
    assertEquals(3, stack.size());
  }

  @Test public void testPop() {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    assertEquals(30, stack.pop());
    assertEquals(20, stack.pop());
    assertEquals(10, stack.pop());
    assertEquals(0, stack.size());
  }

  @Test public void testPeek() {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);

    assertEquals(20, stack.peek());
    assertEquals(2, stack.size());
  }

  @Test public void testIsEmpty() {
    Stack<Integer> stack = new Stack<>();

    assertTrue(stack.isEmpty());

    stack.push(10);

    assertFalse(stack.isEmpty());
  }

  @Test public void testSize() {
    Stack<Integer> stack = new Stack<>();
    assertEquals(0, stack.size());

    stack.push(10);
    stack.push(20);
    stack.push(30);

    assertEquals(3, stack.size());

    stack.pop();

    assertEquals(2, stack.size());
  }
}
