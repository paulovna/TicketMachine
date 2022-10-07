package br.calebe.ticketmachine.core;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PapelMoedaTest {
    @Test
    public void criacaoPapelMoeda(){
        PapelMoeda papelMoeda = new PapelMoeda(5);
        assertEquals(papelMoeda.getQuantidade(),0);;
    }
}
