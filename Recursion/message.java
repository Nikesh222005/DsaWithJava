package DsaWithJava.Recursion;

public class message {
    public static void main(String[] args) {
       // write a function that print hello word
        message();
    }
    static void message(){
        System.out.println("hello world");
        message1();
    }
    static void message1(){
        System.out.println("hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
        message3();
    }
    static void message3(){
        System.out.println("hello world");
        message4();
    }
    static void message4(){
        System.out.println("hello world");
    }
}
