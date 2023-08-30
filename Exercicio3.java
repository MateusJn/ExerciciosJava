package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double custoTotal;

        if (quantidade < 12) {
            custoTotal = quantidade * 1.30;
        } else {
            custoTotal = quantidade * 1.00;
        }

        System.out.println("Valor total da compra: R$ " + custoTotal);

        scanner.close();
    }
}
