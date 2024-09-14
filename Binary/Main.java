package DsaWithJava.Binary;

public class Main {
    public static void main(String[] args){
       int[] arr = {-5,-4,1,5,6,9,78,99,100};
       int target = 100;
       int ans = binarysearch(arr,target);
       System.out.println(ans);

    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
          //  int mid = (start+end)/2; // might be possible that (start +end) exceeds the range of int
            int mid = start +(end - start) /2;
            if(target < arr[mid]){
                end = mid-1;

            }else if (target > arr[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
