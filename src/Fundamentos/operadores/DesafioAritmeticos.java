package Fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        var ex1 = 6 * (3 + 2);
        var ev1 = (int) Math.pow(ex1, 2);
        var ex2 = 3 * 2;
        int resultado1 = ev1 / ex2;

        var exx1 = (1-5) * (2-7);
        var exx2 = exx1 / 2;
        var resultado2 = (int) Math.pow(exx2, 2);

        var expo1 = resultado1 - resultado2;
        var expo2 = (int) Math.pow(expo1, 3);
        var expo3 = (int) Math.pow(10, 3);
        var resultado3 = expo2 / expo3;

        String resultado = "Resultado final do desafio é " + resultado3;
        System.out.println(resultado);

        //eu que resolvi essa situação

        double numA = Math.pow(6 * (3+2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB/ denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultadofinal = superior / inferior;
        System.out.println("O resultado é " + (int) resultadofinal); //desafio resolvido pelo professor

    }
}
