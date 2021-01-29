package Exercicio1;

public class Votos {
    double totalEleitores;
    double votosValidos;
    double votosBrancos;
    double votosNulos;

    public Votos(double totalEleitores, double votosValidos, double votosBrancos, double votosNulos){
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    public double percentualVotosValidos(){
        double percentualValido;

        percentualValido = (this.votosValidos / this.totalEleitores) * 100;

        return percentualValido;
    }

    public double percentualVotosBrancos(){
        double percentualBrancos;

        percentualBrancos = (this.votosBrancos / this.totalEleitores) * 100;

        return percentualBrancos;
    }

    public double percentualVotosNulos(){
        double percentualNulos;

        percentualNulos = (this.votosNulos / this.totalEleitores) * 100;

        return percentualNulos;
    }
}
