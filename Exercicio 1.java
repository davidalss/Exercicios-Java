// Nome do Arquivo: Exercicio 1.java
// Autor: David
// Descrição: Exercício em Java para prática
// Data de Criação: 04/05/2025
// Versão: 1.0

// Desafio 1 - Verificar se o número é par ou ímpar

import java.util.scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}