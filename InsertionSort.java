package org.AED;

import java.util.Arrays;

public class InsertionSort {

    public static void meuInsertionSort(int[] array){
        int tamanho = array.length;

        for (int i = 1; i < tamanho; i++){
            int chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{6,2,1,5,3,4};

        meuInsertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
