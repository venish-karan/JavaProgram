import java.util.Scanner;
public class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        long ans = fact(in.nextInt());
        System.out.println(ans);
    }
    public static long fact(int num) {
        if(num == 0) {
            return 1;
        }
        return num * fact(num-1);
    }
}
