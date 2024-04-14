package DsaWithJava.LinearSearch;



public class Main {
    public static void main(String[] args) {

        int [] nums  = {18,12,3,14,5,6,19,81,9};
        int target = 19;
//        int ans = linersearch(nums, target);
        boolean ans = linersearch3(nums, target);
        System.out.println(ans);
    }
    // search the target and return the elements
    // search the target and return true or false
    static int linersearch2(int[] arr,int target){
        if(arr.length == 0){
            return  -1;
        }
        // run a for loop
        for(int element : arr){
            // check for element at every index if it is = target

            if(element == target){
                return element;
            }
        }
        // this line will execute if  none of the return statements above have executed
        return  Integer.MAX_VALUE;
    }


    static boolean linersearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        // run a for loop
        for(int element : arr){
            // check for element at every index if it is = target

            if(element == target){
                return true;
            }
        }
        // this line will execute if  none of the return statements above have executed
        return false;
    }
     // search in the array : return the index if item found
    // otherwise if item not found return -1
//    static int linersearch(int[] arr,int target){
//        if(arr.length == 0){
//            return  -1;
//        }
//        // run a for loop
//        for(int index = 0; index< arr.length; index++){
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }
//        // this line will execute if  none of the return statements above have executed
//        return -1;
//    }
}
