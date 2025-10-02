import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=0){
            System.out.println(false);
        }
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
