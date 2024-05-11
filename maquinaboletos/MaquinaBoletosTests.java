
package maquinaboletos;

import org.junit.Test;

public class MaquinaBoletosTests {

    @Test
    public void testIngresarDinero() {
        MaquinaBoletos maquina = new MaquinaBoletos(10);
        maquina.ingresarDinero(5);
        assert maquina.getSaldo() == 5;
    }

    @Test
    public void testPrecio() {
        MaquinaBoletos maquina = new MaquinaBoletos(10);
        assert maquina.getPrecio() == 10;
    }

    @Test
    public void testSaldo() {
        MaquinaBoletos maquina = new MaquinaBoletos(10);
        assert maquina.getSaldo() == 0;
    }

    @Test
    public void testTotal() {
        MaquinaBoletos maquina = new MaquinaBoletos(10);
        assert maquina.getTotal() == 0;
    }

    @Test
    public void testImprimirBoleto() {
        MaquinaBoletos maquina = new MaquinaBoletos(25);
        maquina.ingresarDinero(95);
        assert maquina.getSaldo() == 95;
        maquina.imprimirBoleto();
        assert maquina.getSaldo() == 70;
        assert maquina.getTotal() == 25;
    }
 
}
