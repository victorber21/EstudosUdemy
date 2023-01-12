package Controle;

import java.util.Scanner;

public class WhileInderteminado {
    /*pedir pro usuario digitar no console, o scanner pegar a proxima string, usar o .nextline,
    e o usuario vai digitar algumas coisas, somente quando o usuario digitar sair,
    o seu laço vai parar de executar o programa. enquanto a expressão for verdadeira,
    enqaunto não for ditigitado a palavra sair fica executando o determinado bloco
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = entrada.nextLine();
        }


        entrada.close();
    }
}
