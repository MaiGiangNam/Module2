package Bai30;

public class Queue {
    private Node head = null;
    private Node tail = null;
       public void enQueue(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        tail.nextNode = head;
    }


    public int deQueue() {
        if (head == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (head == tail) {
            value = head.value;
            head = null;
            tail = null;
        } else {
            Node temp = head;
            value = temp.value;
            head = head.nextNode;
            tail.nextNode = head;
            temp.nextNode = null;
        }
        return value;
    }

    public void displayQueue() {
        if(head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Elements in Circular Queue are: ");
        Node temp = head;
        while(temp.nextNode != head) {
            System.out.print(temp.value + " ");
            temp = temp.nextNode;
        }
        System.out.print(temp.value);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.displayQueue();
        System.out.println("\nDeleted element: "+queue.deQueue());
        System.out.println("Deleted element: "+queue.deQueue());
        queue.displayQueue();
    }
}
