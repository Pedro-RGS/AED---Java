package org.AED;

public class PesquisaBinaria {

    public static int pesquisaBinaria(int[] array, int valor){
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim){
            int meio = (inicio + fim) / 2;
            int chute = array[meio];

            if (chute == valor){
                return meio;
            }
            else if (chute > valor) {
                fim = meio - 1;
            }
            else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(pesquisaBinaria(array, 9));
    }
}
