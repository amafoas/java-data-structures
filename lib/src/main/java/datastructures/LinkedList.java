package datastructures;

class LinkedListNode<T> {
  T data;
  LinkedListNode<T> next;

  LinkedListNode(T data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedList<T> {
  LinkedListNode<T> head;

  public LinkedList(){
    this.head = null;
  }

  public Boolean insertAt(T data, int position) {
    LinkedListNode<T> curr = this.head;

    if (curr == null) { // CASE: Empty list
      this.head = new LinkedListNode<>(data);
      return true;
    }
    if (position == 0) { // CASE: First position
      LinkedListNode<T> newLinkedListNode = new LinkedListNode<>(data);
      newLinkedListNode.next = curr;
      this.head = newLinkedListNode;
      return true;
    }

    for (int i = 0; i < position-1; i++) {
      curr = curr.next;
      if (curr == null) return false; // position is larger than length of LinkedListNodes
    }
    LinkedListNode<T> newLinkedListNode = new LinkedListNode<>(data);
    newLinkedListNode.next = curr.next;
    curr.next = newLinkedListNode;
    return true;
  }

  public void insert(T data) {
    LinkedListNode<T> newLinkedListNode = new LinkedListNode<>(data);
    if (this.head == null) {
      this.head = newLinkedListNode;
    } else {
      LinkedListNode<T> curr = this.head;
      while (curr.next != null) curr = curr.next;
      curr.next = newLinkedListNode;
    }
  }

  public void insertHead(T data) {
    LinkedListNode<T> newLinkedListNode = new LinkedListNode<>(data);
    if (this.head == null) {
      this.head = newLinkedListNode;
    } else {
      newLinkedListNode.next = this.head;
      this.head = newLinkedListNode;
    }
  }

  public T get(int position) {
    LinkedListNode<T> curr = this.head;
    for (int i = 0; i < position; i++) {
      curr = curr.next;
    }
    return curr.data;
  }

  public T delete(int position) {
    LinkedListNode<T> curr = this.head;
    if (position == 0) {
      T delval = curr.data;
      this.head = curr.next;
      return delval;
    }

    for (int i = 0; i < position-1; i++) {
      curr = curr.next;
    }
    T delval = curr.next.data;
    curr.next = curr.next.next;

    return delval;
  }

  public T deleteLast() {
    LinkedListNode<T> curr = this.head;
    if (curr.next == null) {
      T delval = curr.data;
      this.head = null;
      return delval;
    }

    while (curr.next.next != null) {
      curr = curr.next;
    }
    T delval = curr.next.data;
    curr.next = null;

    return delval;
  }

  public int size() {
    LinkedListNode<T> curr = this.head;
    int size = 0;
    while (curr != null) {
      size++;
      curr = curr.next;
    }
    return size;
  }

  public LinkedList<T> copy(){
    LinkedList<T> newList = new LinkedList<>();
    if (this.head != null) {
      newList.head = new LinkedListNode<>(this.head.data);

      LinkedListNode<T> last = newList.head;
      LinkedListNode<T> curr = this.head.next;
      while (curr != null) {
        last.next = new LinkedListNode<>(curr.data);
        last = last.next;
        curr = curr.next;
      }
    }
    return newList;
  }

  public void print() {
    LinkedListNode<T> curr = this.head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }
}
