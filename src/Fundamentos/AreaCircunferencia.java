package Fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        // o final vem para registrar que essa variavel não pode ser alterada. caso seja, ela dara um erro de compilação
        final double pi = 3.14159;

        double area = pi * raio * raio;

        System.out.println(area);

    }
}
