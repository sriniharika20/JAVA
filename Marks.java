import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Maths = sc.nextInt();
        int Physics = sc.nextInt();
        int Chemistry =  sc.nextInt();
        int sum = Maths+Physics+Chemistry;
        System.out.println("total:"+sum);
        sc.close();
    }
}