package decorator.adventuregame;

import java.security.Key;
import java.util.Scanner;

public class DecoratorDemo {

    public static void main(String[] args) {
        new DecoratorDemo();
    }

    Scanner Keyboard = new Scanner(System.in);


    public DecoratorDemo() {
        System.out.println("Characters Name :");
        String Name = Keyboard.nextLine();
        GameCharacter theCharacter = new BasicCharacter(Name);

        int test = 0;

        do {
        printFate();
        String Fate = Keyboard.nextLine();

            if (Fate.equals("1")) {
                theCharacter = new Shield(theCharacter);
                System.out.println("You got a shield!");
            } else if (Fate.equals("2")) {
                theCharacter = new Starving(theCharacter);
                System.out.println("You Starved");
            } else if (Fate.equals("3")) {
                theCharacter = new Sword(theCharacter);
                System.out.println("You got a Sword");
            } else if (Fate.equals("4")) {
                theCharacter = new Spear(theCharacter);
                System.out.println("You got a Spear!");
            }

            System.out.println("Name: " + theCharacter.getName());
            System.out.println("Might: " + theCharacter.getMight());

        }while ( test!=1);
    }

    public void printFate() {
        System.out.println("Test your luck, select your fate ...");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
