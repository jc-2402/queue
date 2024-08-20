//stack using 2 queues
import java.util.*;
public class Queue6{
    static class Stack{
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            //case 1
            if()
        }
    }
}