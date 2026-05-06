public class binaryinsertion {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 96, 34, 25, 22, 90};
        binaryInsertionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Find the location where key should be inserted
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
