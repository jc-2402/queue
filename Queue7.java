//find non repeating letter in a stream of characters
import java.util.*;
public class Queue7{
    public static void printNonRepeating(String str){
        int freq[] = new int[26]; //a-z
        Queue <Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); //read each char of string str
            q.add(ch);
            freq[ch - 'a']++; //increase count

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1"+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}