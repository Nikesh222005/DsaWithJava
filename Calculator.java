package DsaWithJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ///take input from user till user does not press X or x
        int ans = 0;
        while (true){
            // take operator as input
            System.out.println("Enter the operator:");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if(op == '*' || op == '-' || op == '+' || op == '/' || op == '%'){
                // take two number
                System.out.println("Enter two numvers :");
                int num1=sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();


                if (op == '+') {
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if (op == '/'){
                    if (num2 !=0){
                        ans = num1/num2;

                    }

                }
                if (op == '%'){
                    ans = num1%num2;
                }
                else if (op == 'x' ||  op =='X'){
                    break;

                }
               else {
                    System.out.println("Invalid operation");
                }
            }
            System.out.println(ans);
        }
    }
}
