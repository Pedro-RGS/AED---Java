package org.AED.Pilhas;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
    private int topo;
    private int tamanho;
    private List<T> valores;

    public Pilha(int tamanho){
        this.topo = -1;
        this.tamanho = tamanho;
        valores = new ArrayList<>();
    }

    public void push(T valor){
        if(topo < tamanho - 1){
            valores.add(topo + 1, valor);
            topo++;
        }
        else {
            throw new TransbordamentoException();
        }
    }

    public T pop(){
        if(topo > -1) {
            topo--;
            return valores.get(topo + 1);
        }
        else {
            throw new UnderFlowException();
        }
    }
}
