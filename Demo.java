import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Coolio \nnew\nline\nin\nevery\nsingle\nword\n Pretty cool! What's the code?");
        int code = keyboard.nextInt();

        if(code == 7292)
        {
            System.out.println("Access granted!");
        
        }
        else
        {
            System.out.println("Access Denied!: You are " + (7292 - code) + " away from the code");
        }
        
        System.out.println("What's the word?");
        
        keyboard.nextLine(); // buffers
        keyboard.nextLine(); // buffers
        
        String code1 = keyboard.nextLine();

        if(code1.equals("potato3s"))
        {
            System.out.println("Access granted!");
        
        }
        else
        {
            System.out.println("Access Denied!: its potato3s");
        }
    }
}