import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int  base= sc.nextInt();
        int  height= sc.nextInt();
        float B = 0.5f;
        double  Area =B * base * height;
        System.out.println("Area of Triangle :"+ Area);

        sc.close();
    }
}
