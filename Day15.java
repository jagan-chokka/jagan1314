public class Day15 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

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
        Day15 list = new Day15();
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        
        System.out.println("Original list:");
        list.printList();

        list.deleteFirst();
        System.out.println("After deleting the first node:");
        list.printList();
        
        list.deleteLast();
        System.out.println("After deleting the last node:");
        list.printList();
    }
}