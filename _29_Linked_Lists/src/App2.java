package _29_Linked_Lists.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App2 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 1; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue "
                + q);

        q.remove();
        System.out.println(q.poll());

        // // To remove the head of queue.
        // int removedele = q.remove();
        // System.out.println("removed element-"
        // + removedele);

        // System.out.println(q);

        // // To view the head of queue
        // System.out.println("Elements of queue "
        // + q);
        // int head = q.peek();
        // System.out.println("head of queue-"
        // + head);

        // int head2 = q.poll();
        // System.out.println("head of queue poll-"
        // + head2);
        // System.out.println("Elements of queue "
        // + q);
        // // 0,1,2,3
        // // peek : 0 -> 0123
        // // poll : 0 -> 123

        // // Rest all methods of collection
        // // interface like size and contains
        // // can be used with this
        // // implementation.
        // int size = q.size();
        // System.out.println("Size of queue-"
        // + size);
    }

}