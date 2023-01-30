import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class r28 {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in mathemathics");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in chemistry");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is: " +avg);

        if (avg>= 40 && m1 >= 33 && m2>=33 && m3 >=33)
        {
            System.out.println("congratulations, you have been promoted");
        }
    else
    {
       System.out.println("sorry, you have not been prompted please to again");
    }

        }
    }

