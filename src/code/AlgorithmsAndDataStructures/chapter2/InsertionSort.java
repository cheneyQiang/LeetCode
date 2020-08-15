package code.AlgorithmsAndDataStructures.chapter2;

public class InsertionSort {
    public static void sort(Comparable[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for(int j = i; j > 0; j-- ){
                if(arr[j].compareTo(arr[j - 1]) < 0)
                    swap(arr,j,j-1);
                else
                    break;;
            }
        }
    }

    private static void swap(Object[] arr, int i, int j){
        Object s = arr[i];
        arr[i] = arr[j];
        arr[j] = s;
    }
    public static void sort01(Comparable[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable e = arr[i];
            int j = i;
            for( ; j > 0; j-- ){
                if(arr[j].compareTo(arr[j-1]) < 0){
                    arr[j] = arr[j - 1];
                }else{
                    break;
                }
            }
            arr[j] = e;
        }
    }
}
