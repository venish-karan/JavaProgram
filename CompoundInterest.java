import java.util.*;

public class CompoundInterest {
    public double calculate(int p, double r, int n, int t) {
        double amount = p * Math.pow(1 + (r/n), (n * t));
        return amount;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        double r = in.nextDouble();
        int n = in.nextInt();
        int t = in.nextInt();
        CompoundInterest ci = new CompoundInterest();
        System.out.println(ci.calculate(p, r, n, t));
    }
}
