package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

  @Test public void testSearch() {
    BinaryTree tree = new BinaryTree();

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    assertTrue(tree.search(50));
    assertTrue(tree.search(30));
    assertTrue(tree.search(20));
    assertTrue(tree.search(40));
    assertTrue(tree.search(70));
    assertTrue(tree.search(60));
    assertTrue(tree.search(80));
    assertFalse(tree.search(90));
  }

  @Test public void testDelete() {
    BinaryTree tree = new BinaryTree();

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    assertTrue(tree.search(30));
    tree.delete(30);
    assertFalse(tree.search(30));

    assertTrue(tree.search(70));
    tree.delete(70);
    assertFalse(tree.search(70));

    assertTrue(tree.search(50));
    tree.delete(50);
    assertFalse(tree.search(50));

    assertFalse(tree.search(90));
    tree.delete(90); // Prueba eliminando un nodo inexistente
    assertFalse(tree.search(90));
  }

  @Test public void testHeight() {
    BinaryTree tree = new BinaryTree();

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(90);
    tree.insert(65);

    assertEquals(3, tree.height());

    tree.insert(80);
    tree.insert(75);

    assertEquals(4, tree.height());
  }
}
