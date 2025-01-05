import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declarar la altura del árbol
        System.out.print("¿Cómo de grande quieres la copa del árbol? ");
        int heightTree = scanner.nextInt();

        //poner estrella?
        System.out.print("¿Quieres poner la estrella? (true/false) ");
        boolean starTree = scanner.nextBoolean();

        for (int row = 0; row < heightTree; row++) {
            for (int space = 0; space < heightTree - row - 1; space++) {
                System.out.print(" ");
            }
            if (row == 0 && starTree) {
                System.out.print("\u001b[33m@\u001b[0m"); // Estrella amarilla
            } else {
                for (int asterisk = 0; asterisk < 2 * row + 1; asterisk++) {
                    System.out.print("\u001b[32m*\u001b[0m"); // Asteriscos verdes
                }
            }
            System.out.println();
        }

        // Agregar un tronco
        for (int i = 0; i < 2; i++) {
            for (int space = 0; space < heightTree - 2; space++) {
                System.out.print(" ");
            }
            System.out.println("\u001b[31m##\u001b[0m"); // Tronco marrón
        }

        scanner.close();
    }
}