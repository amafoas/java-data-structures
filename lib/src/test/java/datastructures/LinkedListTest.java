package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

  @Test void testInsertElement() {
    LinkedList<Integer> list = new LinkedList<>();

    list.insert(1);
    list.insert(2);
    list.insert(3);

    assertEquals(1, list.get(0));
    assertEquals(2, list.get(1));
    assertEquals(3, list.get(2));
  }

  @Test void testSizeElement() {
    LinkedList<Integer> list = new LinkedList<>();

    list.insert(1);
    list.insert(1);
    list.insert(1);

    assertEquals(3, list.size());
  }

  @Test void testDeleteElement() {
    LinkedList<String> list = new LinkedList<>();

    list.insert("foo"); // 0
    list.insert("bar"); // 1
    list.insert("baz"); // 2

    assertEquals("bar", list.delete(1));
  }

  @Test void testDeleteLastElement() {
    LinkedList<String> list = new LinkedList<>();

    list.insert("foo"); // 0
    list.insert("bar"); // 1
    list.insert("baz"); // 2

    assertEquals("baz", list.deleteLast());
    assertEquals("bar", list.deleteLast());
    assertEquals("foo", list.deleteLast());
  }

  @Test void testInsertHeadElement() {
    LinkedList<String> list = new LinkedList<>();

    list.insertHead("foo");
    list.insertHead("bar");
    list.insertHead("baz");

    assertEquals("baz", list.get(0));
    assertEquals("bar", list.get(1));
    assertEquals("foo", list.get(2));
  }

  @Test void testInsertAtHead() {
    LinkedList<String> list = new LinkedList<>();

    list.insertAt("foo", 0);
    list.insertAt("bar", 0);
    list.insertAt("baz", 0);

    assertEquals("baz", list.get(0));
    assertEquals("bar", list.get(1));
    assertEquals("foo", list.get(2));
  }

  @Test void testInsertAtOutOfRange() {
    LinkedList<String> list = new LinkedList<>();

    assertEquals(true, list.insertAt("foo", 0));
    assertEquals(false, list.insertAt("bar", 3));
    assertEquals(false, list.insertAt("baz", 5));
  }

  @Test void testInsertAt() {
    LinkedList<String> list = new LinkedList<>();

    list.insertAt("foo", 0);
    list.insertAt("bar", 1);
    list.insertAt("baz", 2);
    list.insertAt("far", 1);

    assertEquals("foo", list.get(0));
    assertEquals("far", list.get(1));
    assertEquals("bar", list.get(2));
    assertEquals("baz", list.get(3));
  }

  @Test void testCopyList() {
    LinkedList<String> list = new LinkedList<>();

    list.insert("foo");
    list.insert("bar");
    list.insert("baz");

    LinkedList<String> listCopy = list.copy();

    assertEquals(list.get(0), listCopy.get(0));
    assertEquals(list.get(1), listCopy.get(1));
    assertEquals(list.get(2), listCopy.get(2));

    listCopy.deleteLast();
    listCopy.insert("far");
    assertEquals("far", listCopy.get(2));
    assertEquals("baz", list.get(2));

  }
}
