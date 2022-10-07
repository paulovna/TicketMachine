package br.calebe.ticketmachine.core;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PapelMoedaTest {
    @Test
    public void criacaoPapelMoeda(){
        PapelMoeda papelMoeda = new PapelMoeda(5);
        assertEquals(papelMoeda.getQuantidade(),0);;
    }
    @Test
    public void verificarValor5(){
        PapelMoeda papelMoeda = new PapelMoeda(5);
        assertEquals(papelMoeda.getValor(),5,0.001);;
    }
    @Test
    public void add1Quantidade(){
        PapelMoeda papelMoeda = new PapelMoeda(5);
        papelMoeda.setQuantidade(papelMoeda.getQuantidade()+1);
        assertEquals(papelMoeda.getQuantidade(),1);;
    }

}
