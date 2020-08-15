package code.AlgorithmsAndDataStructures.chapter2;

public class SelectionSort {
    void sort(Comparable[] arr, int n){
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0){
                    swap(arr,i,minIndex);
                }
            }
        }
    }

    private void swap(Object[] arr,int i, int j) {
        Object p = arr[i];
        arr[i] = arr[j];
        arr[j] = p;
    }
}
