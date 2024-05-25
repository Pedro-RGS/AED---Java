package org.AED;

import java.util.Arrays;

public class SelectionSort {
    // Retorna o índice em que o menor elemento do array está
    public static int menorElemento(int inicio, int[] array){
        int indiceMenor = inicio;

        for(int i = inicio; i < array.length; i ++){
            if (array[i] < array[indiceMenor]){
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }

    public static void selectionSort(int[] array){
        for (int j = 0; j < array.length; j++){
            int indice_menor = menorElemento(j, array);

            if (array[j] > array[indice_menor]){
                int aux = array[j];

                array[j] = array[indice_menor];
                array[indice_menor] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,2,1,5,3,4};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
