import java.util.Scanner;
public class Square{
public static void main(String[] args){
   Scanner sc  = new Scanner(System.in);
   int  side = sc.nextInt();
   int Area = side*side;
System.out.println("Area of square :"+ Area);
sc.close();
}
}