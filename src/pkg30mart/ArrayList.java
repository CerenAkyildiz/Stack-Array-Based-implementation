/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30mart;

/**
 *
 * @author BMB
 */
public class ArrayList {

    private int top;
      private int[] storage=new int[200];
      ArrayList(int capacity) {
            if (capacity <= 0)
                  throw new IllegalArgumentException(
                             "Stack's capacity must be positive");
            storage = new int[capacity];
            top = -1;
      }
 
      
      void push(int value) {
            if (top == storage.length)
                  throw new StackException("Stack's underlying storage is overflow");
            top++;
            storage[top] = value;
      }
 
    /*  int peek() {
            if (top == -1)
                  throw new StackException("Stack is empty");
            return storage[top];
      }*/
 
      int pop() {
            if (top == -1)
                  throw new StackException("Stack is empty");
            return storage[top--];
            
      }
 
      boolean isEmpty() {
            return (top == -1);
      }
 
      public class StackException extends RuntimeException {
            public StackException(String message) {
                  super(message);
            }
      }

    public static void main(String[] args) {
        ArrayList m=new ArrayList(10);
        int a=0;
        int b=9;
        int c=13;
        
        m.top=0;
        m.push(6);
        m.push(5);
        m.push(12);
        
        a=m.pop();
        m.pop();
        System.out.println(a);
        
         b=m.pop();
        m.pop();
        System.out.println(b);
        
    }
}
