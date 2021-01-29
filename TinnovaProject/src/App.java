import Exercicio1.Votos;

public class App {
    public static void main(String[] args) throws Exception {
        Votos votos = new Votos(1000,800,150,50);

        double percentual = votos.percentualVotosValidos();

        System.out.print(percentual);
    }
}
