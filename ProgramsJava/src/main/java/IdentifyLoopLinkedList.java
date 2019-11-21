import java.util.HashSet;
import java.util.Set;
public class IdentifyLoopLinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
public static boolean IdentifyLoop(Node head){
    Set<Node> hash = new HashSet<>();
    while (head != null){
        if(hash.contains(head)) {
            return Boolean.TRUE;
        }
        hash.add(head);
        head = head.next;
    }
    return Boolean.FALSE;
}

public static boolean IdentifyLoopV2(Node head){
    Node slow = head;
    Node fast = head;
    while(slow != null && fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return Boolean.TRUE;
        }
    }
    return Boolean.FALSE;
    }
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(23);
        Node n3 = new Node(45);
        Node n4 = new Node(67);
        Node n5 = new Node(56);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //n5.next = n3;
        System.out.println("Is loop detected: "+IdentifyLoopV2(n1));
    }
}
