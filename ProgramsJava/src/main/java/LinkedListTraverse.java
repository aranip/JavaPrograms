public class LinkedListTraverse {

//   public static class Node{
//       int data;
//       Node next;
//
//       Node(int data, Node next){
//           this.data = data;
//           this.next = next;
//       }
//   }
//
//    public static void main(String[] args) {
//        Node n4 = new Node(4, null);
//        Node n3 = new Node(3, n4);
//        Node n2 = new Node(2, n3);
//        Node n1 = new Node(1, n2);
//
//        Node head = n1;
//
//        while(head != null){
//            System.out.print(head.data);
//            head = head.next;
//        }
//    }


    static class Node{
        int data;
        Node next;

        Node(int data, Node next){

            this.data = data;
            this.next = next;

        }

        public static void main(String[] args) {
            Node n4 = new Node(4, null);
            Node n3 = new Node(3, n4);
            Node n2 = new Node(2, n3);
            Node n1 = new Node(1, n2);

            Node RHead = RLinklist(n1);

            while(RHead != null){
                System.out.print(RHead.data);
                RHead = RHead.next;
            }
        }
        public static Node RLinklist(Node head){

            Node curr = head;
            Node prev = null;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }


    }
}
