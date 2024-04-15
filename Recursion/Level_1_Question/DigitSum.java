package DsaWithJava.Recursion.Level_1_Question;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum2(323);
        System.out.println(ans);
    }
    static int sum2(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum2(n/10);
    }
}
