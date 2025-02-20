public class quickSor {
    public static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int loc = partition(a, low, high);
            quicksort(a, low, loc - 1);
            quicksort(a, loc + 1, high);
        }
    }

    public static int partition(int a[], int low, int high) {
        int pivot = a[low]; 
        int start = low; 
        int end = high; 

        while (start < end) {
            while (a[start] <= pivot) {  
                start++;
            }
            while ( a[end] > pivot) {  
                end--;
            }
            if (start < end) {  
                swap(a, start, end);
            }
        }

        swap(a, low, end);  // Swap pivot to its correct position
        return end;  
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int a[] = {6, 9, 7, 2, 8, 4};
        
        quicksort(a, 0, a.length - 1);
        
        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}

