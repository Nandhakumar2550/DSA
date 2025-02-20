public class bubblesort {
    public static void main(String[] args) {
        int a[]={2,4,6,9,7};
        int n=a.length;
        int temp;
        for(int i=0;i<n-1;i++){
            int flag=0;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1])
                {
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp; 
                   flag=1;
                   }
                }
                if(flag==0){
                    break;
                }
        }
        System.out.println();
        for(int v:a){
            System.out.print(v);
        }
    }
    
}
