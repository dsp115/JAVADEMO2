public class coin

{

  public static void main(String[] args)

  {

    int totalCents = 587;



    int dollar = totalCents / 100;

    int remain = totalCents - (dollar * 100);



    int qrtr = remain / 25;

    remain = remain - (qrtr * 25);



    int dime = remain / 10;

    remain = remain - (dime * 10);



    int nick = remain / 5;

    remain = remain - (nick * 5);



    int pen = remain;



    System.out.println("Dollars: " + dollar + ", Quarters: " + qrtr + ", Dimes: " + dime + ", Nickles: " + nick + ", Pennies: " + pen);

  }

}