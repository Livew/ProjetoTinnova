package Exercicio2;

public class Bubble {
    int[] intArray;

    public Bubble(int[] intArray){
        this.intArray = intArray;
    }

    public int[] ordenarArray(){

        for(int indiceI = 0; indiceI < intArray.length - 1; indiceI++) {

            for(int indiceJ = 0; indiceJ < intArray.length - 1 - indiceI; indiceJ++) {

              if(intArray[indiceJ] > intArray[indiceJ + 1]) {
                int auxiliar = intArray[indiceJ];
                intArray[indiceJ] = intArray[indiceJ + 1];
                intArray[indiceJ + 1] = auxiliar;
              }
            }
        }

        return intArray;
    }
}
