package com.example.springarchives;

public class ListaObj<T> {

    private T[] vetor;
    private int nroElem;

    public ListaObj(int tam) {
        vetor = (T[]) new Object[tam];
        nroElem = 0;
    }

    public void adiciona(T valor) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
        } else {
            vetor[nroElem++] = valor;
        }
    }

    public void exibe() {
        System.out.println("\nExibindo elementos da lista:");
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println();
    }

    public int busca(T valor) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {
            return false;
        } else {
            for (int i = indice; i < nroElem - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            nroElem--;
            return true;
        }
    }

    public boolean removeElemento(T valor) {
        return removePeloIndice(busca(valor));
    }

    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        return indice < 0 || indice >= nroElem ? null : vetor[indice];
    }

    public void limpa() {
        nroElem = 0;
    }
}





