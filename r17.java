import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class r17 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main (String[]args)
    {
      //  private static final Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2==1)
        System.out.println("Weird");
        else
        {
            if (N>2&&N<=5)
            System.out.println("Not Weird");
            else if (N<=20)
            System.out.println("weird");
            else
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
