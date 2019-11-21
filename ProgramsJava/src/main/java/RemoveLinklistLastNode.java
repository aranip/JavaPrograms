public class RemoveLinklistLastNode {

    static class Node {
        int data;
        Node next;
        Node(int tmp) {data = tmp;}
    }

    static Node removeLastNode(Node head) {

        if(head == null || head.next == null) {
            return null;
        }
        // Find the second last node
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        // change the second last node next pointer to null
        temp.next = null;

        return head;
    }

    static void printLinkedList(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void main(String[] a) {

        Node n1 = new Node(23);
        Node n2 = new Node(29);
        Node n3 = new Node(29);
        Node n4 = new Node(45);
        Node n5 = new Node(45);
        Node n6 = new Node(45);
        Node n7 = new Node(54);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        System.out.print("Initial linked list : ");
        printLinkedList(n1);
        n1 = removeLastNode(n1);
        System.out.println();
        System.out.print("Linked list after removing last node: ");
        printLinkedList(n1);
    }
}
