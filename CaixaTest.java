
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CaixaTest {
    
    private Caixa c;
    
    public CaixaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Caixa();
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Caixa.main(args);
        
        fail("The test case is a prototype.");
    }
    
}
