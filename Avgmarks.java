import java.util.Scanner;
public class Avgmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Maths = sc.nextInt();
        int Physics = sc.nextInt();
        int Chemistry =  sc.nextInt();
        float average = (Maths+Physics+Chemistry)/3.0f;
        System.out.printf("Average: %.2f\n", average);
        sc.close();
    }
}
