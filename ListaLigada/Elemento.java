package org.AED.ListaLigada;

public class Elemento {
    private final int valor;
    private Elemento proximo;

    public Elemento (int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

    public void setProximo(Elemento e){
        this.proximo = e;
    }

    public Elemento getProximo(){
        return this.proximo;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
