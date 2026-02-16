import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What fruit or berry would you give me, banana or apple?:");
        
        String fruit  = keyboard.nextLine();
        

        if(fruit.equals("banana"))
        {
            System.out.println("Thank you");
        
        }
        else if(fruit.equals("apple"))
        {
            System.out.println("Thank you");
        }
        else 
        {
            System.out.println("error");
        }
    }
}