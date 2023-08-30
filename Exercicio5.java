package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoatual = scanner.nextInt();
        
        System.out.print("Digite o ano que nasceu: ");
        int anodenascimento = scanner.nextInt();

        int idadeatual;
        idadeatual = (anoatual - anodenascimento);
        
        System.out.println("Sua idade atual: " + idadeatual);

        if (idadeatual < 16) {
            System.out.println("Você ainda não pode votar esse ano!");
        } else {
            System.out.println("Você ja pode votar esse ano!");
        }

        scanner.close();
    }
}
