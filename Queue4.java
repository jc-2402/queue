//implementation using JCF
import java.util.*;
public class Queue4{
    public static void main(String[] args) {
        // Queue <Integer> q = new LinkedList<>();
        //or
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}