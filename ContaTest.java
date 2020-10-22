
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ContaTest {
    
    private Conta c;
    
    public ContaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Conta();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of extrato method, of class Conta.
     */
    @Test
    public void testExtrato() {
        System.out.println("extrato");
        Conta instance = null;
        instance.extrato();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Conta.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        Conta instance = null;
        instance.sacar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class Conta.
     */
    @Test
    public void testDepositar() {
        assertEquals(true, c.depositar(1000));
    }

    /**
     * Test of iniciar method, of class Conta.
     */
    @Test
    public void testIniciar() {
        assertTrue(true, c.iniciar(1));
    }

    /**
     * Test of exibeMenu method, of class Conta.
     */
    @Test
    public void testExibeMenu() {
        assertEquals(true, c.exibeMenu(true));
    }

    /**
     * Test of escolheOpcao method, of class Conta.
     */
    @Test
    public void testEscolheOpcao() {
       assertEquals(opcao, c.escolheOpcao())
    }
    
}
