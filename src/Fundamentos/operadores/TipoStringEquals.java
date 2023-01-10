package Fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");
        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();//.next tira espaços em branco
        System.out.println("2" == s2.trim());//.trim tira o espaços em branco

        entrada.close();
        //.equals compara duas Strings e não ==

    }
}
