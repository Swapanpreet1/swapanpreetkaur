package com.eval;

/**
 * Created by swapanpreetkaur on 2/2/17.
 */

     class Stack<T> {
         int size;
         T[] stackarr;
         int top;

        public Stack(int size) {
            this.size = size;
            stackarr= (T[])new Object[size];
            top = -1;
        }

        public void push(T value){
            if(top == -1){
                throw new StackFullException("overflow");
            }
            stackarr[++top] = value;
        }

        public T pop() {
            if(top == size-1){
                throw new StackEmptyException("underflow");
            }
            return stackarr[top--];
        }

    }
public class stackgen {
        public static void main(String[] args) {
            Stack<Integer> s1= new Stack<Integer>(10);


           //s1.push(2);
            s1.push(5);
            s1.push(6);
            s1.push(7);
            s1.push(10);
            System.out.print("elements popped out: ");
            System.out.print(s1.pop());
            System.out.print(s1.pop()+" ");
            System.out.print(s1.pop()+" ");
            System.out.print(s1.pop()+" ");
            System.out.print(s1.pop()+" ");


        }

    }

class StackFullException extends RuntimeException {
        public StackFullException()
    {
        super();
    }

    public StackFullException(String message)

    {
        super(message);
    }

}


class StackEmptyException extends RuntimeException {

    public StackEmptyException()
    {
        super();
    }

    public StackEmptyException(String message)
    {
        super(message);
    }

}