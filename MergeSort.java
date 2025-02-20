
public class MergeSort{
    public static void mergesort(int a[], int low, int upper) {
        if (low < upper) {
            int mid = (low + upper) / 2;
            mergesort(a, low, mid);
            mergesort(a, mid + 1, upper);
            merge(a, low, mid, upper);
        }
    }

    public static void merge(int a[], int low, int mid, int upper) {
        int i = low, j = mid + 1, k = 0;
        int[] b = new int[upper - low + 1]; // Corrected size of the temporary array

        while (i <= mid && j <= upper) {
            if (a[i] < a[j]) { // Corrected comparison
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        while (i <= mid) { // Copy remaining elements from left subarray
            b[k++] = a[i++];
        }

        while (j <= upper) { // Copy remaining elements from right subarray
            b[k++] = a[j++];
        }

        // Copy sorted elements back into original array
        for (k = 0, i = low; i <= upper; i++, k++) {
            a[i] = b[k];
        }
    }

    public static void main(String[] args) {
        int a[] = {6, 4, 5, 8, 3, 2, 9, 7};
        mergesort(a, 0, a.length - 1);
        System.out.println("Sorted array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
