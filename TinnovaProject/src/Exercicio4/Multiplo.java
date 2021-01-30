package Exercicio4;

public class Multiplo {
    int numero;

    public Multiplo(int numero){
        this.numero = numero;
    }

    public int somaDosMultiplos(){
        int somaMultiplos = 0;

        for(int i = numero-1; i >= 0; i--){
            if (i % 3 == 0 || i % 5 == 0){
                somaMultiplos = somaMultiplos + i;
            }
        }

        return somaMultiplos;
    }
}
