public class Day14 {

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

    public void append(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
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
        Day14 list = new Day14();

        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);

        System.out.println("Created Linked list is:");
        list.printList();
    }
}