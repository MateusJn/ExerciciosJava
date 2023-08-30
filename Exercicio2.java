package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 0) {
            System.out.println("Positivo!");
        } else {
            System.out.println("Negativo!");
        }

        scanner.close();
    }
}
