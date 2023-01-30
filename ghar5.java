import java.util.Scanner;

//taking input from keyboard
public class ghar5 {
    public static void main(String[]args)
    {
        System.out.println("Taking input from user");
        Scanner br = new Scanner(System.in);
        
        System.out.println("enter number 1");
        int a = br.nextInt();
        float a1 = br.nextFloat();
        System.out.println("enter number 2");
        int b = br.nextInt();
        float b1 = br.nextFloat();
        int sum = a + b;
        float sum1 = a + b;
        System.out.println("the sum of these number is ");
        System.out.println(sum);
        boolean b2 =br.hasNextInt();
        System.out.println(b2);
        String str =br.next();
        System.out.println(str); 

    }
    
    
}
