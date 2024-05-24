package org.AED.ListaLigada;

public class ListaLigada {
    private Elemento inicio;
    private Elemento fim;

    public void inserirFim(int valor) {
        Elemento elemento = new Elemento(valor);

        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
        } else {
            fim.setProximo(elemento);
            fim = elemento;
        }
    }

    public void inserirInicio(int valor) {
        Elemento elemento = new Elemento(valor);

        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
        } else {
            elemento.setProximo(inicio);
            inicio = elemento;
        }
    }

    public void inserirEmOrdem(int valor) {
        Elemento elemento = new Elemento(valor);
        Elemento ponteiro = inicio;
        // iniciar uma lista ligada vazia
        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
            return;
        }
        // colocar no inicio no caso de ser menor q ele
        if (elemento.getValor() < inicio.getValor()) {
            elemento.setProximo(inicio);
            inicio = elemento;
            return;
        }
        // percorrer a lista
        while (ponteiro.getProximo() != null && elemento.getValor() >= ponteiro.getProximo().getValor()) {
            ponteiro = ponteiro.getProximo();
        }
        // colocar no final
        if (ponteiro.getProximo() == null) {
            fim.setProximo(elemento);
            fim = elemento;
            return;
        }
        // colocar na frente do elemento que ele é maior
        elemento.setProximo(ponteiro.getProximo());
        ponteiro.setProximo(elemento);
    }
}
