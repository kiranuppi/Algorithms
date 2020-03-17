import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        int Food = runMenu();
        int Price = retrievePrice(Food);
        int change = moneyInserted(Price);
        changeOut(change);
    }

    public static int runMenu() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        System.out.println("\n\nPlease enter your selection:"
                + "\n1: Snickers \t 75"
                + "\n2: Reeses Cup \t 125"
                + "\n3: Doritoes \t 80"
                + "\n4: Pepsi \t 60"
                + "\n5: Exit ");
        choice = keyboard.nextInt();
        return choice;
    }

    public static int retrievePrice(int menuChoice) {
        if (menuChoice == 1)
            return 75;
        if (menuChoice == 2)
            return 125;
        if (menuChoice == 3)
            return 80;
        if (menuChoice == 4)
            return 60;
        else return 0;
    }

    public static int moneyInserted(int Price) {
        Scanner keyboard = new Scanner(System.in);
        int money = 0;
        System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
        money = keyboard.nextInt();
        while (money < Price) {
            System.out.println("Please insert sufficient funds");
            money = money + keyboard.nextInt();
        }
        return money - Price;
    }

    public static void changeOut(int change) {
        int five_p = 0;
        int ten_p = 0;
        int twenty_p = 0;
        int fifty_p = 0;

        while (change >= 50) {
            fifty_p = fifty_p + 1;
            change = change - 50;
        }

        while (change >= 20) {
            twenty_p = twenty_p + 1;
            change = change - 20;
        }

        while (change >= 10) {
            ten_p = ten_p + 1;
            change = change - 10;
        }

        while (change >= 5) {
            five_p = five_p + 1;
            change = change - 5;
        }




        // to see the change, print it to the console perhaps
        System.out.printf("\nHere's your change:\n%d five_p, %d ten_p, %d twenty_p and %d fifty_p!",
                five_p, ten_p, twenty_p, fifty_p);
    }
}

