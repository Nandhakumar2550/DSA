public class circularqueue {
    int front = 0;
    int rear = -1;
    int size = 0;
    int capacity = 5;
    int arr[] = new int[capacity];

    
    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity;  // Move rear forward
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        int data = arr[front]; 
        front = (front + 1) % capacity; 
        size--;
        return data;
    }

    
    public void show() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " "); 
        }
        System.out.println();
    }
    public int seek(){
        if(size==0){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        circularqueue nums = new circularqueue();
        nums.enqueue(12);
        nums.enqueue(16);
        nums.enqueue(19);
        nums.enqueue(21);
        nums.enqueue(23);
        nums.show();  
        System.out.println( nums.dequeue()); 
        nums.enqueue(24);
        nums.show();  
        System.out.println( nums.dequeue()); 
        System.out.println( nums.dequeue()); 
        System.out.println(nums.dequeue()); 
        System.out.println( nums.dequeue()); 
        System.out.println("last element :" + nums.seek());

        nums.show(); 
    }
}
