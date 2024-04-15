package DsaWithJava.Recursion.Level_1_Question;

public class sum {
    public static void main(String[] args) {
        int ans = sum1(6);
        System.out.println(ans);
    }
    static int sum1(int n){
        if(n<=1){

            return 1;
        }
        return n+ sum1(n-1);
    }
}
