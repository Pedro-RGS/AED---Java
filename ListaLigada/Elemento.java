package org.AED.ListaLigada;

public class Elemento {
    private int valor;
    private Elemento proximo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    Elemento (int valor){
        this.valor = valor;
        this.proximo = null;
    }
}
