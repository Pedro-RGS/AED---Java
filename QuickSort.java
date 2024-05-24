package org.AED;

public class QuickSort {

    public static void ordenar(int[] elementos, int inicio, int fim){
        if (inicio < fim){
            int q = particionar(elementos, inicio, fim);
            ordenar(elementos, inicio, q - 1);
            ordenar(elementos, q + 1, fim);
        }
    }

    public static int particionar(int[] valores, int inicio, int fim){
        int pivot = valores[fim];
        int i = inicio;
        int temporaria;

        for (int j = inicio; j < fim; j++){
            if (valores[j] < pivot){

                temporaria = valores[i];

                valores[i] = valores[j];
                valores[j] = temporaria;
                i++;
            }
        }

        temporaria = valores[fim];

        valores[fim] = valores[i];
        valores[i] = temporaria;

        return i;
    }

    public static void main(String[] args) {
        int[] lista = new int[]{4, 7, 2, 6, 4, 1, 8, 3};

        ordenar(lista, 0, 7);

        for (int i : lista){
            System.out.print(i);
        }
    }
}
