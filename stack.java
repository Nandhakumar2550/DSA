public class stack {
    int arr[]=new int[5];
    int top;
    int size;
    
    public stack(){
        size=arr.length;
        top=-1;
    }

    public void push(int data){
        top=top+1;
        if(top<size){
            arr[top]=data;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    public void printstack(){
        for(int n:arr){
            System.out.print(n + "  ");
        }

    }
    public int pop(){
        if(top>-1){
        return arr[top--];
    }
    else{
        System.out.println("stack underflow");
    }
    return 0;

    }
    public int peek(){
        return arr[top];
    }
    public static void main(String[] args) {
        stack nums=new stack();
        nums.push(12);
        //System.out.println(nums.peek());
        nums.push(15);
        nums.push(18);
        System.out.println(nums.pop());
        nums.push(14);
        nums.push(23);
        System.out.println(nums.peek());

        nums.printstack();

    }
    
}
