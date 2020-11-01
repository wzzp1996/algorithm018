
public class HeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 3, 10, 9, 11, 8};
        heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Time O(n/2 * log(N) + O((n - 1) * log(N)))
    // Space O(1)
    private static void heapSort(int[] array) {
        // Build heap （rearrange array）
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        // One by one extract an element from heap
        for (int i=n-1; i>0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i) {
        int root = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && array[l] > array[root]) {
            root = l;
        }
        if (r < n && array[r] > array[root]) {
            root = r;
        }

        if (i != root) {
            int temp = array[i];
            array[i] = array[root];
            array[root] = temp;
            heapify(array, n, root);
        }
    }
}
