package com.eval;
import java.util.*;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */


/**
 * Created by swapanpreetkaur on 2/1/17.
 */
class Overflow extends Exception
{
    Overflow(String s)
    {
        super(s);
    }
}


class Underflow extends Exception
{

    Underflow(String s)
    {
        super(s);
    }
}
public class queueimp1 {


    int sizeofqueue=3;
    int len;
    int queuearr[] = new int[sizeofqueue];
    int front= -1;int rear = 0;

    public void insert(int ele) throws Overflow{
        //try {
            if (front < sizeofqueue - 1) {
                front++;
                queuearr[front] = ele;
                System.out.println(ele + " insert to Queue ");
                queuestatus();
            }
        //}

        //catch(Exception e)
        //{
          //  System.out.println("Error : " );
        //}
        else
            //{
            //System.out.println("overflow ");
        //}
                throw new Overflow("Overflow Exception");


    }

    public void delete() throws Underflow {
        if (front >= rear) {
            rear++;
            System.out.println("front ele deleted from queue");
            queuestatus();
        }
        else

        {
            throw new Underflow("underflow exception");
        }


            //{
            //System.out.println("underflow");
        //}
    }

    public void queuestatus() {
        if (front >= rear) {
            System.out.println("status of the queue : ");
            for (int i = rear; i <= front; i++) {
                System.out.println(queuearr[i]);
            }
        }
    }



    public boolean isEmpty()
    {
        return front == -1;
    }
    public boolean isFull()
    {
        return front==0 && rear == sizeofqueue -1 ;
    }

    public int getSize()
    {
        return len ;
    }

    /* public int peek()
    {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return queuearr[front];
    }

*/
    public static void main(String[] args) {
        try {
            queueimp1 q1 = new queueimp1();

            q1.delete();
            q1.insert(23);
            q1.insert(2);
            q1.insert(73);
            q1.insert(21);
            //q1.insert(21);
            q1.delete();
            q1.delete();
            q1.delete();
            q1.delete();
        }
       catch(Overflow e)
        {
            System.out.println(e);
        }

        catch(Underflow e)
        {
            System.out.println(e);
        }


        //System.out.println("Empty status = "+q1.isEmpty());
        //System.out.println("Full status = "+q1.isFull());
        //System.out.println("Size = "+ q1.getSize());
        //default : System.out.println("Wrong Entry \n ");


    }}

