package code.AlgorithmsAndDataStructures.chapter3;

public class MergeSort {
    public void sort(Comparable[] arr){
        int n = arr.length;
        mergeSort(arr, 0,n-1);
    }
    private void mergeSort(Comparable[] arr,int l, int r){
        int mid = ( l + r) / 2;
        if(l >= r)
            return;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1, l);
        merge(arr,l,mid,r);
    }

    private void merge(Comparable[] arr, int l, int mid, int r) {
        int n = r- l + 1;
        Comparable[] unx = new Comparable[n];
        for (int i = l; i < r; i++) {
            unx[i - l] = arr[i];
        }
        int i = l;
        int j = mid + 1;
        for(int k = l; k <= r; k++){
            if(i > mid){
                arr[k] = unx[j - l];
                j++;
            }
            else if(j > r){
                arr[k] = unx[i - l];
                i++;
            }
            else if (unx[i - l].compareTo(unx[j - l]) < 0){
                arr[k] = unx[i - l];
                i++;
            }
            else{
                arr[k] = unx[j - l];
                j++;
            }
        }
    }
}
