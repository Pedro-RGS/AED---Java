package org.AED.HeapSort;

import java.util.Arrays;

public class HeapSort {
    // Essa função faz com que o array se mantenha em forma de uma max-heap consistentemente
    public static void maxHeapfy(int[] array, int elemento, int tamanho){
        int esquerdo = elemento * 2 + 1;
        int direito = elemento * 2 + 2;
        int maior = elemento;

        if (esquerdo < tamanho && array[esquerdo] > array[elemento]){
            maior = esquerdo;
        }

        if (direito < tamanho && array[direito] > array[maior]){
            maior = direito;
        }

        if (elemento != maior){
            int temp = array[elemento];
            array[elemento] = array[maior];
            array[maior] = temp;
            maxHeapfy(array, maior, tamanho);
        }
    }

    public static void heapSort(int[] array, int tamanho){
        // Este FOR serve para aplicar o maxHeapfy no array por completo
        // Assim, garantindo que ele é uma MAX-HEAP
        for (int i = tamanho / 2; i >= 0; i--){
            maxHeapfy(array, i, tamanho);
        }

        // Este FOR funciona como um selection sort que troca o primeiro
        // elemento da lista pelo último (passando a ignorá-lo e o último vira o anterior a ele)
        // e aplica o maxHeapfy novamente.
        for (int i = tamanho - 1; i > 0; i--){
            int aux = array[0];
            array[0] = array[i];
            array[i] = aux;
            maxHeapfy(array, 0, i);
        }
    }

    public static void main(String[] args) {
        int[] lista = new int[]{4,5,867,2,435,7,9,54,64,23,54,0};
        HeapSort.heapSort(lista, 12);

        System.out.println(Arrays.toString(lista));
    }
}
