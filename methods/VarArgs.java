package DsaWithJava.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,56,56,43,67,65);
//        fun();
        multiple(2,3,"Kunal","Nick");
//        Demo(1,2,3,4,5,6,7,8);
//        Demo("Kunal ","Rahul");
    }
    static void Demo(int ...v){
      System.out.println(Arrays.toString(v));
    }
    static void Demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){


    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
