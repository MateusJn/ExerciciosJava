package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        
        float media;
        media = (nota1 + nota2) /2;
        
        System.out.println("Média do aluno: "+ media);
        
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
