package DsaWithJava.methods;

public class Overloading {
    public static void main(String[] args) {
//      fun(9);
//      fun("Kunal Khushwaha");
       int ans= sum(20,30);
        System.out.println(ans);
//       int ans1 = sum(20,30,40);
//        System.out.println(ans1);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);

    }
}
