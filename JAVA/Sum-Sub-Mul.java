import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {


        Scanner input =new Scanner(System.in);
        System.out.print("Enter the First Value: ");
        int a = input.nextInt();
        System.out.print("Enter the Second Value: ");
        int b =input.nextInt();

        int sum = a+b;
        int sub= a-b;
        int mul=a*b;
        double div =a/b;


        System.out.println("Result :");
        System.out.println("Summation : "+sum);
        System.out.println("Subtraction : "+sub);
        System.out.println("Multiplication : "+mul);
        System.out.println("Division : "+div);
    }
}
