import java.util.Scanner;

public class r9 {
    public static void main (String[]args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner (System.in);
        double kilometer = sc.nextDouble();

        double mile = kilometer *0.621371;
       // double mile = sc.nextDouble();
    System.out.println(sc);

        System.out.println("Distance in kilometre=" +kilometer  +"kilometre");
        System.out.println("Distance in miles=" +mile  +"miles");
    }
}
