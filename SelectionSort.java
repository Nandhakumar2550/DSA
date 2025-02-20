public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {6, 3, 5, 8, 2};  
        int size = nums.length;
        
        for (int i = 0; i < size - 1; i++) {
            int m = i; 
            
            for (int j = i + 1; j < size; j++) {
                if (nums[m] > nums[j]) { 
                    m = j;
                }
            
            
            
            int temp = nums[m];
            nums[m] = nums[i];
            nums[i] = temp;
            }
            
            System.out.println();
            for (int n : nums) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nAfter sorting:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

    
    

