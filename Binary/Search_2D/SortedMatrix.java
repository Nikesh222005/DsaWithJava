package DsaWithJava.Binary.Search_2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args){
        int [] [] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        System.out.println(Arrays.toString(sarch(arr,10)));

    }
    static int[] binarysearch(int[][] matrix ,int row, int cstart,int cEnd,int target){
        while (cstart <= cEnd) {

            int mid = cstart +(cEnd-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target) {
                cstart = mid+1;
            }
            else {
                cEnd = mid-1;
            }
        }
        return new int [] {-1,-1};
    }
    static int [] sarch (int[][] matrix,int target){
        int row = matrix.length;
        int cols = matrix[0].length;
        if(cols == 0){
            return new int[] {-1,-1};
        }
        if(row == 1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart = 0;
        int rEnd = row -1;
        int cMid = cols /2;

        while(rstart < (rEnd -1)){
            int mid = rstart +(rEnd-rstart)/2;
            if(matrix[mid][cMid] == target){
                return  new int [] {mid,cMid};
            }
            if (matrix[mid][cMid] < target){
                rstart = cMid;
            }
            else {
                rEnd = mid;
            }
        }
        if(matrix[rstart][cMid] == target){
            return new int[]{rstart,cMid};
        }
        if(matrix[rstart+1][cMid] == target){
            return new int[]{rstart + 1,cMid};
        }
        if(target <= matrix[rstart][cMid - 1] ){
            return binarysearch(matrix,rstart,0,cMid -1,target);
        }

       if(target >= matrix[rstart][cMid + 1] && target<= matrix[rstart][cols-1]){
           return binarysearch(matrix,rstart,cMid + 1,cols -1,target);
       }
        if(target <= matrix[rstart + 1][cMid - 1] ){
            return binarysearch(matrix,rstart + 1,0,cMid -1,target);
        }
        else {
            return binarysearch(matrix,rstart +1, cMid +1,cols-1, target);
        }

    }

}
