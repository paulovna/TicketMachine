package br.calebe.ticketmachine.core;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrocoTest {
    @Test
    public void testeQuantidade100(){
        Troco troco = new Troco(126.89);
        assertEquals(troco.papeisMoeda[5].getQuantidade(),1);;
    }
}

