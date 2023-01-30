public class r18 {
    public static void main(String[]args)
    {
        float number_1,number_2;
        System.out.println("Enter first number");
        number_1 = scan.nextFloat();

        System.out.println("enter second number");
        number_2 = scan.nextFloat();

        System.out.println("you hve entered");
        System.out.println(number_1);
        System.out.println("and");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for '+' substraction, 2 for multiplication and 3 for dividion";

        System.out.println(prompt);
        int input = scan.nextInt();
        switch(input)
        {
            case 0: 
            System.out.println("adding these number");
            System.out.println("the result is :");
            System.out.println(number_1 + number_2);
            break;

            case 1:
            System.out.println("substracting these number" );
            System.out.println("the result is:");
            System.out.println(number_1 - number_2);

            case 2:
            System.out.println("multiplying these number");
            System.out.println("the result is");
            System.out.println(number_1 * number_2);

            case 3:
            System.out.println("dividing these  number");
            System.out.println("the result is ");
            System.out.println(number_1 / number_2);
            
            default:
            System.out.println("Invalid input");


        }
    }
}
