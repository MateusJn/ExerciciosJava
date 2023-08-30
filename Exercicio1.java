package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: "); 
        int valor = scanner.nextInt();

        if (valor > 10) {
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10!");
        }

        scanner.close();
    }
}
