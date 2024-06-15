package org.AED.Pilhas;

public class Program {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(2);

        pilha.push(1);
        pilha.push(2);
        System.out.println(pilha.toString());
        System.out.println(pilha.pop());
        System.out.println(pilha.toString());
        pilha.push(3);
        System.out.println(pilha.toString());
    }
}
