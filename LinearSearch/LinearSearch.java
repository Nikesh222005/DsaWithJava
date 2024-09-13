package Nick.DsaWithJava.LinearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int [] arr = {22,33,445,443,12,16,778,99};
        int target = 445;
        int ans= linearsearch(arr,target);
        System.out.println(ans);

    }
    static int linearsearch( int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            int ele = arr[i];
            if(ele == target){
                return i;
            }
        }
        return -1;
    }
}

