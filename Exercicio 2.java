// Nome do Arquivo: Exercicio 2.java
// Autor: David
// Descrição: Exercício em Java para prática
// Data de Criação: 05/05/2025
// Versão: 1.0

// Criar Calculado de IMC (Índice de Massa Corporal) em Java
// O IMC é calculado dividindo o peso (em kg) pela altura (em metros) ao quadrado.
// O resultado é classificado em diferentes categorias:
// - Abaixo do peso: IMC < 18.5
// - Peso normal: 18.5 <= IMC < 24.9
// - Sobrepeso: 25 <= IMC < 29.9
// - Obesidade: IMC >= 30
// O programa deve solicitar ao usuário o peso e a altura, calcular o IMC e exibir a categoria correspondente.

import java.util.Scanner;

    public class Exercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Solicitar peso e altura ao usuário
            System.out.print("Digite seu peso (em kg): ");
            double peso = scanner.nextDouble();
            
            System.out.print("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();
            
            // Calcular IMC
            double imc = peso / (altura * altura);
            
            // Exibir resultado e categoria
            System.out.printf("Seu IMC é: %.2f\n", imc);
            
            if (imc < 18.5) {
                System.out.println("Categoria: Abaixo do peso");
            } else if (imc < 24.9) {
                System.out.println("Categoria: Peso normal");
            } else if (imc < 29.9) {
                System.out.println("Categoria: Sobrepeso");
            } else {
                System.out.println("Categoria: Obesidade");
            }
            
            scanner.close();
        }
    }