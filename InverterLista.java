package org.AED;

import java.util.Arrays;

public class InverterLista {

    public static int[] Invertedor(int[] lista){
        int tamanho = lista.length;

        for (int i = 0; i <= tamanho / 2; i++){
            int controle = lista[i];
            lista[i] = lista[tamanho - i - 1];
            lista[tamanho - i - 1] = controle;
        }

        return lista;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(array));
    }
}
