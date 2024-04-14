
package DsaWithJava.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // write a function that take in a number and prints it
        // print first  5 numbers : 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are a calling a function again and again you treat it ad a separate call in stack
        // this is called tail recursion
        // this is called last function call
        print(n+1);
    }



}
