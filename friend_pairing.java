package Recursion;

public class friend_pairing {
    public static int findpair(int n){
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        int fnm1 = findpair(n-1);

        //pair
        int fnm2 = (n-1) * findpair(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(findpair(3));
    }
}
