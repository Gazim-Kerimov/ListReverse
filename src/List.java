public class List {
    Node head;
    Node tail;

    public void reverse(){
        Node node = head;
        while(node != null){
            Node next = node.next;
            Node previous = node.previous;
            node.previous = next;
            node.next = previous;
            if(next == null){
                head = node;
            }
            if(previous == null){
                tail = node;
            }
            node = next;
        }
    }





    public class Node{
        int value;
        Node next;
        Node previous;
    }
}
