package org.AED.Fila;

public class Program {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.adicionarFinal(1);
        fila.adicionarFinal(2);
        fila.adicionarFinal(3);

        System.out.println(fila.toString());
    }
}
