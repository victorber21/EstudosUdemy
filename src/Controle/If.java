package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Você esta aprovado");
        } else {
            System.out.println("Esta reprovado");
        }

        entrada.close();
    }
}
