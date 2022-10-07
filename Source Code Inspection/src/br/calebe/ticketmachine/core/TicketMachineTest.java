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
}
