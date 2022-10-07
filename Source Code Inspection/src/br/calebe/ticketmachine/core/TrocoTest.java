package br.calebe.ticketmachine.core;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrocoTest {
    @Test
    public void testeQuantidade100(){
        Troco troco = new Troco(126.89);
        assertEquals(troco.papeisMoeda[5].getQuantidade(),1);;
    }
    @Test
    public void testeQuantidade50(){
        Troco troco = new Troco(176.89);
        assertEquals(troco.papeisMoeda[4].getQuantidade(),1);;
    }
    @Test
    public void testeQuantidade20(){
        Troco troco = new Troco(126.89);
        assertEquals(troco.papeisMoeda[3].getQuantidade(),1);;
    }
    @Test
    public void testeQuantidade10(){
        Troco troco = new Troco(111.89);
        assertEquals(troco.papeisMoeda[2].getQuantidade(),1);;
    }
    @Test
    public void testeQuantidade5(){
        Troco troco = new Troco(106.89);
        assertEquals(troco.papeisMoeda[1].getQuantidade(),1);;
    }
    @Test
    public void testeQuantidade2(){
        Troco troco = new Troco(102.89);
        assertEquals(troco.papeisMoeda[0].getQuantidade(),1);;
    }

}

