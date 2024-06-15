package org.AED.ListaLigada;

public class Program {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        listaLigada.adicionarCauda(1);
        listaLigada.adicionarCauda(2);
        listaLigada.adicionarCauda(3);
        listaLigada.adicionarCauda(4);
        listaLigada.delete(1);

        // use o debugger
//        listaLigada.inserirEmOrdem(9);
//        listaLigada.inserirEmOrdem(3);
//        listaLigada.inserirEmOrdem(7);
//        listaLigada.inserirEmOrdem(6);
//        listaLigada.inserirEmOrdem(5);
//        listaLigada.inserirEmOrdem(0);
//        listaLigada.inserirEmOrdem(8);
//        listaLigada.inserirEmOrdem(4);
//        listaLigada.inserirEmOrdem(1);
//        listaLigada.inserirEmOrdem(2);
    }
}
