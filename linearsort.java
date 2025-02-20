public class linearsort {
    public static void main(String [] args){
        int num[]={2,6,4,5,1};
        int target=2;
        int i;
        for( i=0; i<num.length;i++)
        {
            if(num[i]==target)
            {
                System.out.println(i);
                break;
            }
        }
        if(i==num.length)
        {
            System.out.println("number not found");

        }
       
    }
    
}
