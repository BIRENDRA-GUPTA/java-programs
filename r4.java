import java.util.Scanner;

public class r4 {
    public static void main (String []args)
{
    System.out.println("taking input from the user");
    Scanner sc = new Scanner(System.in);

    System.out.println("enter number 1");
    int a= sc.nextInt();
    float a1 = sc.nextFloat();
    System.out.println("enter number 2");
    int b = sc.nextInt();
    float b1 = sc.nextFloat();
    int sum = a + b;
    float sum1 = a + b;
    System.out.println("the sum of thse number is");
     System.out.println(sum);
     boolean b2 = sc.hasNextInt();
     System.out.println(b2);
     String str = sc.next();
     String str1 = sc.nextLine();
     System.out.println(str1);
}
}
