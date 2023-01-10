package Fundamentos.operadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();

        double imc = peso / altura;
        double resultado = Math.pow(imc, 2);
        System.out.printf("Seu IMC é: %.2f", resultado);


        entrada.close();
    }
}
