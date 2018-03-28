import org.junit.Test

class ProdusTest extends GroovyTestCase {

    protected String value1, value2, value3;


    protected void setUp(){
        value1 = "123" ;
        value2 = "asus" ;
        value3 = "working" ;
    }
    @Test
    public void given_codprodus_when_string_then_true(){
        assertTrue(value1.equals("123"));
    }
    @Test
    public void given_marca_when_string_then_true(){
        assertTrue(value2.equals("asus"));
    }
    @Test
    public void given_status_when_string_then_true(){
        assertTrue(value3 instanceof String);
    }
    @Test
    public void given_newproduct_when_makeanewproduct_then_idnotnull(){
//arrange
        Produs produs = new Produs(value1,value2);
        String cod=produs.getCod();
        String marca=produs.getMarca();
//act
        assertTrue(cod=="123");
        assertTrue(cod=="asus");
    }

}
