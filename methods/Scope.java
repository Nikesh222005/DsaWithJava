package DsaWithJava.methods;

public class Scope {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        String name = "kunal";

        {
            // int a =78; already initialised outside the block in the in the same methode, hence you cannot initialised again
             a = 78; // reassign the origin ref variable to some other value
            System.out.println(a);
             int c = 98;
             name = "rahul";
            System.out.println(name);
             // values initialised in this block,will remain in block
        }
        int c = 88;
        System.out.println(a);
        System.out.println(name);
//      //  System.out.println(c);  // cannot use outside the block
        // Scoping in for loops
        for(int i = 0;i<4;i++){
            System.out.println(i);
            int num = 90;
            a =1000;
        }
        System.out.println();
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
