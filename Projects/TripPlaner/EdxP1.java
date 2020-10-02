import java.util.Scanner;
public class EdxP1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Greeting
        System.out.println("Welcome to Vacation Planner!");

        System.out.print("what is your name? ");
        String name = input.nextLine();

        System.out.print("Nice to meet you " + name + ", where are you heading to? ");
        String place = input.nextLine();

        System.out.print("Great! " + place + " sounds like a great trip ");


        //Part 2 Travel time and budget
        System.out.print("How many days are you going to spend traveling? ");
        int num = input.nextInt();


        //Part 2 - Show user their budget in USD (idk)
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double num2 = input.nextDouble();

        input.nextLine();

        //Part 2 - Show the user their budget in the travel destination’s currency for the total trip and per day (idk)
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String letterC = input.nextLine();

        System.out.print("How many " + letterC + " are there in 1 USD? ");
        double num5 = input.nextDouble();

        input.nextLine();

        System.out.println( "If you are traveling for " + num + " days that is the same as " + (num*24) + " hours or " + (num * 1440) +  " minutes");
        System.out.println("If you are going to spend $" + num2 + " USD that means per day you can spend up to $" + (num2 / num) + " USD ");
        System.out.println("Your total budget in MXC is " + (num5 * num2) + " MXC, which per day is " + ((num5 * num2) / num) +" MXC");


        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int num3 = input.nextInt();

        System.out.println("that means that when it is midnight at home it will be " + num3 + ":00 in your travel destination and when it is noon at home it will be " + (12 + num3) + ":00");

        //Part 4 - Country Area
        System.out.print("what is the square area of your destination country in km2? ");
        int num4 = input.nextInt();
        //int num44 = num4 *  0.386102159; ?
        System.out.print("The square area of your destination country in miles^2 will be "  + (num4 *  0.386102159) );

    }
}
