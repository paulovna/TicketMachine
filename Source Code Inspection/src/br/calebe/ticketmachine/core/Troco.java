package br.calebe.ticketmachine.core;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class Troco {

    public PapelMoeda papeisMoeda[] = new PapelMoeda[6];
    public double moedas[] = new double[6];
    
    public Troco(double valor) {
        papeisMoeda[5] = new PapelMoeda(100);
        int quantidade = (int)valor/100;
        this.papeisMoeda[5].setQuantidade(quantidade);
        valor = valor-100*quantidade;
        
        papeisMoeda[4] = new PapelMoeda(50);
        quantidade = (int)valor/50;
        papeisMoeda[4].setQuantidade(quantidade);
        valor = valor-50*quantidade;
        
        papeisMoeda[3] = new PapelMoeda(20);
        quantidade = (int)valor/20;
        papeisMoeda[3].setQuantidade(quantidade);
        valor = valor-20*quantidade;
        
        papeisMoeda[2] = new PapelMoeda(10);
        quantidade = (int)valor/10;
        papeisMoeda[2].setQuantidade(quantidade);
        valor = valor-10*quantidade;
        
        papeisMoeda[1] = new PapelMoeda(5);
        quantidade = (int)valor/5;
        papeisMoeda[1].setQuantidade(quantidade);
        valor = valor-5*quantidade;
        
        papeisMoeda[0] = new PapelMoeda(2);
        quantidade = (int)valor/2;
        papeisMoeda[0].setQuantidade(quantidade);
        valor = valor-2*quantidade;
        
        valor = valor*100;
        
        quantidade = (int)valor/100;
        moedas[5] = quantidade;
        valor = valor-100*quantidade;
        
        quantidade = (int)valor/50;
        moedas[4] = quantidade;
        valor = valor-50*quantidade;
        
        quantidade = (int)valor/25;
        moedas[3] = quantidade;
        valor = valor-25*quantidade;
        
        quantidade = (int)valor/10;
        moedas[2] = quantidade;
        valor = valor-10*quantidade;
        
        quantidade = (int)valor/5;
        moedas[1] = quantidade;
        valor = valor-5*quantidade;
        
        moedas[0] = valor;
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
    }
}
