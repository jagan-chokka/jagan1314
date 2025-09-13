public class Day13 {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    public void printList() {
        Node currentNode = head;
        System.out.print("LinkedList: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Day13 linkedList = new Day13();

        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        linkedList.printList();
    }

}
