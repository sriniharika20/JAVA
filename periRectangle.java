import java.util.Scanner;
public class periRectangle {
     public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int perimeter = 2;
        int length = sc.nextInt();
        int Breadth = sc.nextInt();
        int  value = perimeter*(length+Breadth);
        System.out.println("Perimeter of rectangle :"+value);
        sc.close();
     }
}
