import Exercicio1.Votos;
import Exercicio3.Fatorial;

public class App {
    public static void main(String[] args) throws Exception {
        Votos votos = new Votos(1000,800,150,50);

        double percentualValidos = votos.percentualVotosValidos();
        double percentualBrancos = votos.percentualVotosBrancos();
        double percentualNulos = votos.percentualVotosNulos();

        System.out.println(percentualValidos+"% Votos validos");
        System.out.println(percentualBrancos+"% Votos brancos");
        System.out.println(percentualNulos+"% Votos nulos");


        Fatorial fatorial = new Fatorial(5);

        int fatorialResult = fatorial.calculaFatorial();

        System.out.println(fatorialResult);
    }
}
