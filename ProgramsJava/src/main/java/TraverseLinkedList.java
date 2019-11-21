public class TraverseLinkedList {

    public static void main(String[] args) {
        Node n4 = new Node(4, null);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);


//    Node reverseHead = recurseLinkedList(n1);
//
//        System.out.println("");
//
//        while(reverseHead != null){
//            System.out.print(reverseHead.next != null ? (reverseHead.value + "->") : reverseHead.value);
//            reverseHead = reverseHead.next;
//        }
//
//        System.out.println("");

        Node rHead = iterativeLinkedList(n1);

        while(rHead != null){
            System.out.print(rHead.next != null ? (rHead.value + "->") : rHead.value);
            rHead = rHead.next;
        }
    }



    static class Node{
        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

//    public static Node recurseLinkedList(Node head){
//
//
//        if(head == null || head.next == null){
//            return head;
//        }
//        Node p = recurseLinkedList(head.next);
//        head.next.next = head;
//        head.next = null;
//
//        return p;
//
//    }

    public static Node iterativeLinkedList(Node head){

    Node prev = null;
    Node curr = head;
    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;

    }

    return prev;


    }
}
