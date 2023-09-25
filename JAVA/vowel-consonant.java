import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        char ch;
        int count=0;
        char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        ch = scan.next().charAt(0);

        for(int i=0; i<10; i++)
        {
            if(ch==vowels[i])
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\n" +ch+ " is a Consonant");
        else
            System.out.println("\n" +ch+ " is a Vowel");
    }
}
