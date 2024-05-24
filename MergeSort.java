package org.AED;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] lista, int inicio, int fim){
        if (inicio >= fim){
            return;
        }
        int meio = (inicio + fim) / 2;
        sort(lista, inicio, meio);
        sort(lista, meio + 1, fim);
        merge(lista, inicio, meio, fim);
    }
    public static void merge(int[] lista, int inicio, int meio, int fim){
        int NL = meio - inicio + 1;
        int NR = fim - meio;

        int[] left = new int[NL];
        int[] right = new int[NR];

        for (int i = 0; i < NL; i++){
            left[i] = lista[inicio + i];
        }

        for (int j = 0; j < NR ; j++){
            right[j] = lista[meio + j + 1];
        }

        int x = 0;
        int y = 0;
        int k = inicio;

        while (x < NL && y < NR){
            if (left[x] < right[y]){
                lista[k] = left[x];
                k++;
                x++;
            }
            else {
                lista[k] = right[y];
                k++;
                y++;
            }
        }

        while (x < NL){
            lista[k] = left[x];
            k++;
            x++;
        }

        while (y < NR){
            lista[k] = right[y];
            k++;
            y++;
        }
    }

    public static void main(String[] args) {
        int[] lista = new int[]{7,5,2,7,1,0};
        sort(lista, 0, 5);

        System.out.println(Arrays.toString(lista));
    }
}
