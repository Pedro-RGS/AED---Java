package org.AED;

public class MenorElemento {
    // Retorna o índice em que o menor elemento do array está
    public static int menorElemento(int[] array){
        int menor = array[0];
        int indiceMenor = 0;

        for(int i = 0; i < array.length; i ++){
            if (array[i] < menor){
                menor = array[i];
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,2,1,5,3,4};

        System.out.println(menorElemento(array));
    }
}
