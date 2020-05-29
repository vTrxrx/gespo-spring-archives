package com.example.springarchives;

public class FilaCircular {

    private Integer inicio;
    private Integer fim;
    private Integer tamanho;
    private String[] fila;

    public FilaCircular(Integer tamanho) {
        this.tamanho = tamanho;
        this.fila = new String[tamanho];
        this.fim = 0;
        this.inicio = 0;
    }

    public Boolean isEmpty() {
        return tamanho == 0;
    }

    public Boolean isFull() {
        return tamanho == fila.length;
    }

    public void insert(String info) {
        if (isFull()) {
            System.out.println("Fila cheia");
            return;
        }

        this.fila[fim] = info;
        this.fim = (this.fim + 1) % this.fila.length;
        this.tamanho++;
    }

    public String peek() {
        if (this.isEmpty()) {
            System.out.println("A fila está vazia");
            return null;
        }

        return this.fila[this.inicio];
    }

    public String poll() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
            return null;
        }
        String res = fila[inicio];

        this.fila[this.inicio] = null;
        this.inicio = (this.inicio + 1) % this.fila.length;
        this.tamanho--;

        return res;
    }

    public void exibe() {
        for (int i = inicio; i < fim; i = (i + 1) % this.fila.length) {
            System.out.print(this.fila[i] + " ");
        }
        System.out.println();
    }
}
