package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int precoDoBilhete;
    protected int saldo;
    protected int papelMoeda[] = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        System.out.println("Aguarde alguns instantes, por favor!");
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia;
        System.out.printf("Saldo atual: %d", getSaldo());
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < precoDoBilhete) {
            throw new SaldoInsuficienteException();
        }        
        
        this.saldo -= precoDoBilhete;
        
        String result = "*****************\n";
        result += "*** R$ " + getSaldo() + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
