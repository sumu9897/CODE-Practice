import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        if(num%2==0)
            System.out.println("\n" +num+ " is an Even Number.");
        else
            System.out.println("\n" +num+ " is an Odd Number.");
    }
}
