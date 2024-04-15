package DsaWithJava.Recursion.Level_1_Question;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = sum2(323);
        System.out.println(ans);

    }
    static int sum2(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*sum2(n/10);
    }
}
