package DsaWithJava.Recursion.Level_1_Question;

public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
        funRev(5);
        Bothfun(5);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
         fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void Bothfun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funRev(n-1);
        System.out.println(n);

    }
}
