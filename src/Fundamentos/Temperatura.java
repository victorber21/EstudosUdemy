package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (ºF - 32) x 5/9 = ºC -> formula de conversão F para celsius

        final int regra = 32;
        final double divisao = 5/9.0;
        double F = 86;
        double C = (F - regra) * divisao;

        System.out.println("O resultado é " + C +"ºC");
    }
}
