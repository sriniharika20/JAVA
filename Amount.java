import java.util.Scanner;
public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Amount = sc.nextInt();
        int thousands = Amount / 1000;
        Amount = Amount % 1000;
        int fiveHundreds = Amount / 500;
        Amount = Amount % 500;
        int remaining = Amount;
        System.out.println("1000s: " + thousands);
        System.out.println("500s: " + fiveHundreds);
        System.out.println("Remaining: " + remaining);
        sc.close();
    }
}
