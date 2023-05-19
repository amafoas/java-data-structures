package datastructures;

import java.util.ArrayList;

public class Queue<T> {
  ArrayList<T> queue;

  public Queue() {
    queue = new ArrayList<>();
  }

  public void enqueue(T value){
    queue.add(value);
  }
  public T dequeue(){
    return queue.remove(0);
  }
  public T front(){
    return queue.get(0);
  }
  public boolean isEmpty(){
    return queue.size() == 0;
  }
  public int size(){
    return queue.size();
  }

}
