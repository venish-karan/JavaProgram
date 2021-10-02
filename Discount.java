import java.util.Scanner;
public class Discount {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float price = in.nextFloat();
        float perct = in.nextFloat();
        float disc = price * (perct/100);
        float finalPrice = price - disc;
        System.out.println(finalPrice);
    }
}
