package org.AED.Pilhas;

import java.util.Arrays;

public class Pilha {

    public int tamanho;
    public int[] array;
    public int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.topo = -1;
        this.array = new int[tamanho];
    }

    public void push(int elemento){
        if (this.topo < this.tamanho){
            topo++;
            array[topo] = elemento;
        }
        else {
            throw new OverflowException();
        }
    }

    public int pop(){
        if (topo >= 0){
            return array[topo--];
        }
        else {
            throw new UnderFlowException();
        }
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "tamanho=" + tamanho +
                ", array=" + Arrays.toString(array) +
                ", topo=" + topo +
                '}';
    }
}
