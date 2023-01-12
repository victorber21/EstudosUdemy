package Controle;
//calcular media das notas de uma turma
//usuario vai digitar uma nota validade de 10 a 0
//quando usuario digitar uma nota valida, armazenar a nota em uma variavel total
// e sempre que uma nova nota for acrescentada vai somando no total para armazenar todas as notas
// outra variavel

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) { //enquanto a nota for diferente de -1 continue, caso contratio saia.
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();
        }

        if (nota <= 10 && nota >= 0) {
            total += nota;
            quantidadeDeNotas++;
        }

        // Calcular a média
        double media = total / quantidadeDeNotas;
        System.out.println("Média = " + media);

        entrada.close();

    }
}





