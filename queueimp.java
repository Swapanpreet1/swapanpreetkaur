package com.eval;

/**
 * Created by swapanpreetkaur on 2/1/17.
 */
public class queueimp {


        int sizeofqueue=3;
        int queuearr[] = new int[sizeofqueue];
        int front= -1;int rear = 0;

        public void insert(int ele) {
            if (front < sizeofqueue - 1) {
                front++;
                queuearr[front] = ele;
                System.out.println(ele
                        + " insert to Queue ");
                queuestatus();
            } else {
                System.out.println("overflow ");
            }

        }

        public void delete() {
            if (front >= rear) {
                rear++;
                System.out.println("front ele deleted from queue");
                queuestatus();
            } else {
                System.out.println("underflow");
            }
        }

        public void queuestatus() {
            if (front >= rear) {
                System.out.println("status of queue : ");
                for (int i = rear; i <= front; i++) {
                    System.out.println(queuearr[i]);
                }
            }
        }

        public static void main(String[] args) {
            queueimp q1 = new queueimp();
            q1.delete();
            q1.insert(23);
            q1.insert(2);
            q1.insert(73);
            q1.insert(21);
            q1.delete();
            q1.delete();
            q1.delete();
            q1.delete();
        }}
