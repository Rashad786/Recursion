package Recursion;

public class factorial {
    public static int fact(int x){
        int fact=1;
        if(x==0){
            return 1;
        }

        return x*fact(x-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Factorial is "+fact(n));
    }
}
