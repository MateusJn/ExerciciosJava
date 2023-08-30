package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        int duracao;

        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");

        scanner.close();
    }
}
