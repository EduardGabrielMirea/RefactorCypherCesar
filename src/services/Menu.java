package services;

import javax.crypto.Cipher;
import java.util.Scanner;

public class Menu {

    private static int currentScreen = 0;

    public void runMenu() {

        int optionChoose;
        while (true){
            printMenu();
            optionChoose = getOption();
            if (optionChoose == 0) break;
            if (currentScreen == 0){
                switch (optionChoose){
                    case 1:

                        break;
                }
            }
        }


    }

    private static void printMenu(){
        System.out.println("------------------------------------------");
        System.out.println(" 0- Salir | 1- Crea un detergente | 2- Crea un cereal | 3- Crea un vino | 4- Calcula calorias (Se crean automaticamente 2 productos)");
        System.out.println("------------------------------------------");

    }

    private static int getOption(){
        Scanner sc = new Scanner(System.in);
        int option = -1;
        try {
            option = Integer.parseInt(sc.next());
            if (currentScreen == 0 && option < 1 || option > 6) {
            }
        }catch (NumberFormatException nfe){
            System.out.println("Opcion incorrecta");
        }
        return option;
    }
}
