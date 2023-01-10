package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioAreaTriangulo {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        double base = entrada.nextDouble();

        System.out.println("Digite o valor da altura");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double resultado = area / 2;

        System.out.println("O valor da área desse triangulo é de: " + resultado);

        entrada.close();
    }
}
