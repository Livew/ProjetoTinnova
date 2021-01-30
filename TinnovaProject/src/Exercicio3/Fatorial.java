package Exercicio3;

public class Fatorial {

    int fator;

    public Fatorial(int fator){
        this.fator = fator;
    }

    public int calculaFatorial(){
        int resultadoFatorial = 1;

        if(fator == 0) return 1;

        for (int i = 1; i < fator; i++){
            resultadoFatorial = resultadoFatorial * (i+1);
        }   

        return resultadoFatorial; 
    }
}
