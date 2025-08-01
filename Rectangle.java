import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int Breadth = sc.nextInt();
        int Area = length*Breadth;
        System.out.println("Area of rectangle :"+Area);

        sc.close();
    }
}
