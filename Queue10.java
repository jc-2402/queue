//deque
import java.util.*;
public class Queue10{
    public static void main(String[] args) {
        Deque <Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(4);
        d.addLast(6);
        d.addLast(3);
        System.out.println(d);
        d.removeLast();
        d.removeFirst();
        System.out.println(d);
        System.out.println("first ele = "+d.peekFirst());
        System.out.println("last ele = "+d.peekLast());

    }
}