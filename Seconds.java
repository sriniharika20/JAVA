import java.util.Scanner;

public class Seconds {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int hour = total/3000;
        total = total%3000;
        int mintue = total/600;
        total = total%600;
        int seconds = total%60;
        System.out.println("hours:"+hour);
        System.out.println("mintues:"+mintue);
        System.out.println("seconds:"+seconds);

        sc.close();
}
}
