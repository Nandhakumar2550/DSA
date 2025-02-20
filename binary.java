public class binary {
    public static void main(String[] args){
        int a[] = {2,4,5,7,9,12};
        int data = 12;
        int first = 0;
        int last = a.length - 1;
        while(first<=last){
           int mid=(first + last) / 2;
            if(a[mid] == data){
                System.out.println(mid);
                break;
            }
            else if(a[mid] < data)
            {
                first = mid + 1;

            }
            else{
                last = mid-1;
                break;
            }
        }
        System.out.println("number not found");


    }
    
}
