package org.AED.Fila;

import java.util.Arrays;

public class Fila {
    private int[] fila;
    private int tamanho;

    public Fila(int tamanho){
        this.fila = new int[tamanho];
        this.tamanho = tamanho;
    }

    public void adicionarFinal(int valor){
        tamanho++;
        fila[tamanho] = valor;
    }

    @Override
    public String
    toString() {
        return "Fila{" +
                "fila=" + Arrays.toString(fila) +
                ", tamanho=" + tamanho +
                '}';
    }
}
