class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlist {
    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {  // Fix: Iterate until the last node
                current = current.next;
            }
            current.next = newNode;  // Append the new node at the end
        }
    }

    public void printValues() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");  // Add space for readability
            current = current.next;
        }
        System.out.println();

    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;  
    }
    public void delete(int data){
        Node current=head;
        while(current.next!= null && current.next.data!=data){
            current=current.next;
        }
        if(current.next!=null){
            current.next=current.next.next;
        }
    }

    public static void main(String[] args) {
        linkedlist nums = new linkedlist();
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.addFirst(23);
        nums.delete(7 );
        nums.printValues();  // Expected output: 3 5 7
    }
}
