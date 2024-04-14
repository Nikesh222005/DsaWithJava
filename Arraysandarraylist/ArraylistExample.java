package DsaWithJava.Arraysandarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(65);
//        list.add(88);
//        list.add(1);
//        list.add(99);
//        list.add(77);
//        list.add(56);
//        list.add(98);
//        list.add(8);
//        System.out.println(list.contains(99));
//        System.out.println(list);
//
//        list.set(1,112);
//        System.out.print(list);

        // Input
        for(int i = 0; i<5;i++){
            list.add(In.nextInt());
        }

        // get item at any index
        for(int i = 0; i <5; i++){
            System.out.println(list.get(i)); //press index here list(index) syntax will not work here
        }
        System.out.println(list);


    }
}
