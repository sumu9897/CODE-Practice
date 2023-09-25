import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = s.next().charAt(0);

        if((ch>='A' && ch<='z') || (ch>='a' && ch<='z'))
            System.out.println("\nThe character \'" +ch+ "\' is an Alphabet.");
        else if(ch>='0' && ch<='9')
            System.out.println("\nThe character \'" +ch+ "\' is a Digit.");
        else
            System.out.println("\nThe character \'" +ch+ "\' is neither an Alphabet nor a Digit.");
    }
}
