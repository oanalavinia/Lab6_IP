import org.junit.Test

class StatusTest extends GroovyTestCase {

    protected String value1, value2;


    protected void setUp(){
        value1 = "123" ;
        value2 = "working" ;
    }
    @Test
    public void given_codprodus_when_string_then_true(){
        assertTrue(value1.equals("123"));
    }
    @Test
    public void given_status_when_string_then_true(){
        assertTrue(value2 instanceof String);
    }
}
