package Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioPorHora = 0.0;
        double horasTrabalhadas = 0.0;
        double salarioTotal = 0.0;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        salarioPorHora = scanner.nextDouble();

        double horasExtras = Math.max(horasTrabalhadas - 160, 0); // Estamos considerando 40 horas por semana em 4 semanas (160 horas no mês)

        salarioTotal = (horasTrabalhadas * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);

        System.out.println("Salário total do funcionário: R$ " + salarioTotal);

        scanner.close();
    }
}
