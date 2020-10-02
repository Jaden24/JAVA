
import java.util .*;
public class EdxP2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //Greeting
            System.out.println("Let's play a game called \"Odds and Evens\"");

            System.out.print("What is your name? ");
            String name = input.nextLine();

            System.out.print("Hi " + name + " , which do you choose? (o)dds or (e)vens? ");
            String choose = input.nextLine();

            if (choose.equals("o")) {
                System.out.println(name + " has picked odds! The computer will be evens");
            } else {
                System.out.println(name + " has picked evens! The computer will be odds");
            }

            System.out.println("-------------------------------");

            System.out.print("How many “fingers” do you put out?");
            int fingers = input.nextInt();

            Random rand = new Random();
            int computer = rand.nextInt(6);

            System.out.print("The computer plays " + computer + " \"fingers\"");

            int sum = fingers + computer;
            System.out.println(fingers + " + " + computer + "=" + sum + "!");

            boolean oddOrEven = sum % 2 == 0;
            if (oddOrEven) {
                System.out.println(sum + " is even.");
                if (choose.equals("e")) {
                    System.out.println("That means ..." + name + " wins!");
                } else {
                    System.out.println("That means computer wins.");
                }
            } else {
                System.out.println(sum + " is odd.");
                if (choose.equals("o")) {
                    System.out.println("That means... " + name + " wins!");
                } else {
                    System.out.println("That means computer wins.");
                }
            }
        }
    }

