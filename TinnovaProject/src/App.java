import Exercicio1.Votos;
import Exercicio3.Fatorial;
import Exercicio4.Multiplo;

public class App {
    public static void main(String[] args) throws Exception {

        //Exercicio 1 - Votos
        Votos votos = new Votos(1000,800,150,50);

        double percentualValidos = votos.percentualVotosValidos();
        double percentualBrancos = votos.percentualVotosBrancos();
        double percentualNulos = votos.percentualVotosNulos();

        System.out.println(percentualValidos+"% Votos validos");
        System.out.println(percentualBrancos+"% Votos brancos");
        System.out.println(percentualNulos+"% Votos nulos");

        //Exercicio 2 - Bublble
        

        //Exercicio 3 - Fatorial
        Fatorial fatorial = new Fatorial(5);

        int fatorialResult = fatorial.calculaFatorial();

        System.out.println(fatorialResult);


        //Exercicio 4 - Multiplos
        Multiplo multiplo = new Multiplo(20);

        int soma = multiplo.somaDosMultiplos();

        System.out.println(soma);
    }
}
