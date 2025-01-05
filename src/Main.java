import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declarar la altura del árbol
        System.out.print("¿Cómo de grande quieres la copa del  árbol?");
        int heightTree = scanner.nextInt();

        //poner la estrella
        System.out.println("\n ¿Quieres poner la estrella?(true/false)");
        boolean starTree = scanner.nextBoolean();

        for (int row = 0; row < heightTree; row++) {


            for (int space = 0; space < (heightTree - row -1); space++) {
                System.out.print(" ");
            }
            if (row == 0 && starTree) {
                System.out.print("\u001b[33m@");
            } else {
                for (int asterisk = 0; asterisk < (row * 2) + 1; asterisk++) {
                    System.out.print("\u001b[32m*");
                }

            }
            System.out.println(" ");

            scanner.close();
        }

    }
}