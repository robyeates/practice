package thirtydays;

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution5 {

    public static Node insert(Node head, int data) {
        if (head == null) {
            return new Node(data);
        } else {
            Node node = new Node(data);
            Node tail = head.next;
            if (tail == null) {
                head.next = node;
                return node;
            }
            while(tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
            return node;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}