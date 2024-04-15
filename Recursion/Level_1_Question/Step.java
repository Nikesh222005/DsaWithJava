package DsaWithJava.Recursion.Level_1_Question;

public class Step {
    public static void main(String[] args) {
        System.out.println(nuberofSteps(876666));
    }
    public static int nuberofSteps(int num){
        return helper(num, 0);
    }
    private static int helper(int num,int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num/2,steps-1);
        }
        return helper(num-1,steps+1);
    }

}
