package br.calebe.ticketmachine.core;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TicketMachineTest {
    @Test
    public void instanciaPreco(){
        TicketMachine tm = new TicketMachine(5);
        assertEquals(tm.precoDoBilhete, 5);;
    }  
    @Test
    public void instanciaSaldo(){
        TicketMachine tm = new TicketMachine(5);
        assertEquals(tm.saldo, 0);;
    }
    @Test
    public void insercaoValida(){
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(5);
        assertEquals(tm.saldo, 5);;
    }
    @Test
    public void insercaoInvalida(){
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(7);
        assertEquals(tm.saldo, 7);;
    }
    @Test
    public void Troco(){
        TicketMachine tm = new TicketMachine(3);
        tm.inserir(5);
        int troco = tm.getTroco();
        assertEquals(troco, 2);;
    }
}
