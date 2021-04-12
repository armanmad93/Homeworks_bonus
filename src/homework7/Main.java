package homework7;

import homework7.battle.Battle;
import homework7.myFile.MyFile;
import homework7.solders.Archer;
import homework7.solders.Swordsman;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        File file = new File("battle.txt");
        MyFile myFile = new MyFile();

        Archer archer = new Archer(100, 1000, 0.7);
        Swordsman swordsman = new Swordsman(100, 1000, 0.8);
        Battle battle = new Battle();

        System.out.println("******************************************");
        System.out.println("********* WELCOME TO GAME MASTER *********");
        System.out.println("******************************************");
        System.out.println();

        System.out.print("PLEASE PUT ENTER. ");

        while (true) {
            if (archer.getHeath() <= 0 || swordsman.getHeath() <= 0) {
                file.deleteOnExit();
                System.out.print("Win " );
                System.out.println(archer.getHeath() <= 0 ? "Swordsman." : "Archer.");
                break;
            } else {
                if (scanner.nextLine().equals("")) {
                    if (file.length() == 0) {
                        battle.battle(archer, swordsman);
                        myFile.writeInformationAboutBattle(file, archer, swordsman);
                    } else {
                        myFile.importInformationAboutBattle(file, archer, swordsman);
                        battle.battle(archer, swordsman);
                        myFile.writeInformationAboutBattle(file, archer, swordsman);
                    }
                } else {
                    System.out.println("ERROR TRY AGAIN!");
                }
            }

            System.out.println("Archer push -> " + archer.getPush());
            System.out.println("Archer heath -> " + archer.getHeath());
            System.out.println("Swordsman push -> " + swordsman.getPush());
            System.out.println("Swordsman heath -> " + swordsman.getHeath());
            System.out.println("************************");

        }

    }
}
