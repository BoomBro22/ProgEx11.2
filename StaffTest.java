import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaffTest {

    protected String title = "Bossman";
    
	@Test
	void testGetTitle() {

		assertEquals(title, "Bossman");	
		
	}

}
