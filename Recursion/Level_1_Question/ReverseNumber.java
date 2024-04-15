package DsaWithJava.Recursion.Level_1_Question;

public class ReverseNumber {
    public static void main(String[] args) {
//        Rev1(1234);
//        System.out.println(sum);
        System.out.println(Rev2(1234));

    }
    static int sum = 0;
    static void Rev1(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum *10+rem;
        Rev1(n/10);

    }
    static int Rev2 (int n){
        // some time you might need some additional variable in the varible in the arugment
        // in that case,make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n% 10 == n){
            return n;
        }
        int rem = n%10;
        return rem *(int) Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
