package code.AlgorithmsAndDataStructures.chapter2;

public class QuickSort {
    public void sort(Comparable[] arr){
        int n = arr.length;
        quickSort(arr,0,n-1);
    }

    private void quickSort(Comparable[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int p = partition(arr,l,r);
        quickSort(arr,l,p);
        quickSort(arr,p + 1, r);
    }

    private int partition(Comparable[] arr, int l, int r){
        Comparable a = arr[l];
        int j = l;
        for (int i = l+1; i <= r; i++) {
            if(arr[i].compareTo(a)<0){
                swap(arr,i,j + 1);
                j++;
            }
        }
        swap(arr,j,l);
        return j;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
