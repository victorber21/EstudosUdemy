package Fundamentos.operadores;

import java.sql.SQLOutput;

public class DesafioLogicos {
    public static void main(String[] args) {
        /*Trabalho na terça (V ou F)
         Trabalho na quinta (V ou F)
         Se apenas um trabalho der certo, comprar a tv de 32 polegadas
         Se os dois trabalhos derem certo, comprar a tv de 50 polegadas
         E nos dois casos, a familia vai tomar sorvete
         Unico cenario que não vai acontecer nada, é se nenhum dos dois dias acontecer o trabalho */

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv30 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;


        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 30\"? " + comprouTv30);
        System.out.println("Comprou sorvete? " + comprouSorvete);
        System.out.println("Mais saudavel? " + !comprouSorvete);


        }



    }

