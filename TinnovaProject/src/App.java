import Exercicio1.Votos;
import Exercicio2.Bubble;
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

        //Exercicio 2 - Bubble
        int[] arrayDesordenado = {5, 3, 2, 4, 7, 1, 0, 6};
        Bubble bubble = new Bubble(arrayDesordenado);

        int[] arrayOrdenado = bubble.ordenarArray();

        for (int num : arrayOrdenado){
            System.out.println(num);
        }
        
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
