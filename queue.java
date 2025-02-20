public class queue {
    int front=0;
    int rear=-1;
    int size=0;
    int arr[]=new int[5];

    public void enqueue(int data){
        rear++;
        arr[rear]=data;
        size++;

    }
    public int dequeue(){
        front++;
        int data=arr[front];
        return data;

    }
    public void show(){
        for(int i=front;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        
    }
    public static void main(String[] args) {
        queue nums=new queue();
        nums.enqueue(12);
        nums.enqueue(16);
        nums.enqueue(19);
        nums.enqueue(21);
        nums.enqueue(23);
        System.out.println(nums.dequeue());
        nums.show();
    }
    
}
