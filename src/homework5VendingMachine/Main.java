package homework5VendingMachine;

import homework5VendingMachine.Products.VendingMachine.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("******   WELCOME TO VENDING MACHINE   ******");
        System.out.println("********************************************");
        System.out.println("******     PLZ ENTER YOUR COMMAND     ******");
        System.out.println("********************************************");
        System.out.println();
        System.out.print("Command: ");


        Command command = new Command();
        VendingMachine vendingMachine = new VendingMachine();

        String scannerCommand;
        while (true) {
            try {
                scannerCommand = command.commandControl(scanner.nextLine());
                break;
            } catch (MyNewExeption myNewExeption) {
                System.out.println("plz try again Master.");
            }
        }

        command.commandSplit(scannerCommand);
        System.out.println();
        System.out.println("Congratulation.");
        System.out.println("you got " + command.getProductCount() + " " + command.getType() + ".");
        System.out.println();
        System.out.println(vendingMachine.takeProduct(command));

    }
}
