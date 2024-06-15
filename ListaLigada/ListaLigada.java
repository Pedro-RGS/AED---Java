package org.AED.ListaLigada;

public class ListaLigada {
    private Elemento cabeca;
    private Elemento cauda;

    public void adicionarCabeca(int valor){
        if (this.cabeca == null){
            this.cabeca = new Elemento(valor);
        }
        else {
            Elemento novaCabeca = new Elemento(valor);
            novaCabeca.setProximo(this.cabeca);
            this.cabeca = novaCabeca;
            this.cauda = this.cabeca.getProximo();
        }
    }

    public void adicionarCauda(int valor){
        if (this.cabeca == null){
            Elemento inicio = new Elemento(valor);
            this.cauda = inicio;
            this.cabeca = inicio;
        }
        else {
            Elemento novaCauda = new Elemento(valor);
            this.cauda.setProximo(novaCauda);
            this.cauda = novaCauda;
        }
    }

    public void inverterLista(){
        Elemento aux = this.cabeca;
        this.cabeca = this.cauda;
        this.cauda = aux;
    }

    public void delete(int valor){
        Elemento aux = this.cabeca;

        if (this.cabeca.getValor() == valor){
            this.cabeca = this.cabeca.getProximo();
            return;
        }

        while (aux.getProximo() != null){
            if (aux.getProximo().getValor() == valor){
                aux.setProximo(aux.getProximo().getProximo());
                if (this.cauda.getValor() == valor){
                    this.cauda = aux;
                }
                return;
            }
//            if (aux.getProximo().getProximo() == null){
//                aux.setProximo(null);
//                this.cauda = aux;
//                return;
//            }
            aux = aux.getProximo();
        }
    }

//    public void inserirEmOrdem(int valor) {
//        Elemento elemento = new Elemento(valor);
//        Elemento ponteiro = inicio;
//        // iniciar uma lista ligada vazia
//        if (inicio == null) {
//            inicio = elemento;
//            fim = elemento;
//            return;
//        }
//        // colocar no inicio no caso de ser menor q ele
//        if (elemento.getValor() < inicio.getValor()) {
//            elemento.setProximo(inicio);
//            inicio = elemento;
//            return;
//        }
//        // percorrer a lista
//        while (ponteiro.getProximo() != null && elemento.getValor() >= ponteiro.getProximo().getValor()) {
//            ponteiro = ponteiro.getProximo();
//        }
//        // colocar no final
//        if (ponteiro.getProximo() == null) {
//            fim.setProximo(elemento);
//            fim = elemento;
//            return;
//        }
//        // colocar na frente do elemento que ele é maior
//        elemento.setProximo(ponteiro.getProximo());
//        ponteiro.setProximo(elemento);
//    }
}
