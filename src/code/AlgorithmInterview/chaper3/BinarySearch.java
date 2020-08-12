package code.AlgorithmInterview.chaper3;

public class BinarySearch {
    public  int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;//防止整型溢出
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){//说明要找的数据在mid左边
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr;
        int n = 1000000;
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.println(new BinarySearch().binarySearch(arr,11110));
    }
}
