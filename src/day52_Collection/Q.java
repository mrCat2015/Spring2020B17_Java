package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();//FIFO

        q.add("D");
        q.add("F");
        q.add("C");
        q.add("A");
        System.out.println(q);

        String qq = q.poll();
        System.out.println(qq);
        System.out.println(q);




    }
}
