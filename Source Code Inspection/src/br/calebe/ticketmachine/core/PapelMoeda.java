package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected float valor;
    protected int quantidade;

    public PapelMoeda(float valor) {
        this.valor = valor;
        this.quantidade = 0;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
