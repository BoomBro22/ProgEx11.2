import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PersonTest {

    protected String name = "Devon";
    protected String address = "44574 Ecorse Rd";
    protected String phoneNumber = "734-624-6763";
    protected String email = "dbaile39@emcih.edu";
    
    @Test
    void testgetName() {
    	
    	assertEquals(name, "Devon");
    	
    }
    
    @Test
    void testgetAddress() {

    	assertEquals(address, "44574 Ecorse Rd");
    	
    }

    @Test
    void testgetPhoneNumber() {

    	assertEquals(phoneNumber, "734-624-6763");
    	
    }

    @Test
    void testgetEmail() {

    	assertEquals(email, "dbaile39@emcih.edu");
    	
    }
}