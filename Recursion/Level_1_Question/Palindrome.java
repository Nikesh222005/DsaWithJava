package DsaWithJava.Recursion.Level_1_Question;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(12321));
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
    static boolean palin(int n){
        return  n == Rev2(n);

    }
}
