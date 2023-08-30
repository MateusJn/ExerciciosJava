package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioFixo = 0.0;
        double vendas = 0.0;
        double salarioTotal = 0.0;

        System.out.print("Valor do salário fixo: ");
        salarioFixo = scanner.nextDouble();

        System.out.print("Valor das vendas: ");
        vendas = scanner.nextDouble();

        double comissao = 0.0;

        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (vendas - 1500) * 0.05;
        }

        salarioTotal = salarioFixo + comissao;

        System.out.println("Salário total: R$ " + salarioTotal);

        scanner.close();
    }
}
