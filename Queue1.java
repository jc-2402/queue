//implementation of queue using array
public class Queue1{
    static class Queue{
        static int arr[];
        static int size;
        static int rare;

        Queue(int n){
          arr = new int[n];
          size = n;
          rare = -1;
        }

        public static boolean isEmpty(){
            return rare == -1;
        }
        //add
        public static void add(int data){
            if(rare == size-1){
                System.out.println("Queue is full");
                return;
            }
            rare = rare + 1;
            arr[rare] = data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rare; i++){
                arr[i] = arr[i+1];
            }
            rare = rare -1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!Queue.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}