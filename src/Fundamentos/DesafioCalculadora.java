package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite primeiro numero");
        double num1 = entrada.nextDouble();

        System.out.println("Qual tipo de operação?");
        String operacao = entrada.next();

        System.out.println("Digite segundo numero");
        double num2 = entrada. nextDouble();

        //Lógica
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 + num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f" , num1, operacao, num2, resultado);
        entrada.close();






    }
}
