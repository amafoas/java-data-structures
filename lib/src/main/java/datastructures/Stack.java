package datastructures;

import java.util.ArrayList;

public class Stack<T> {
  ArrayList<T> stack;

  public Stack() {
    stack = new ArrayList<>();
  }

  public void push(T value) {
    stack.add(value);
  }
  public T pop() {
    return stack.remove(stack.size()-1);
  }
  public T peek() {
    return stack.get(stack.size()-1);
  }
  public boolean isEmpty() {
    return stack.size() == 0;
  }
  public int size() {
    return stack.size();
  }

}
