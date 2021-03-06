package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import playground.*;
public class Test1 {
    public Test1() {
        super();
    }
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
    String message = "Robert";      
       String messageUtil = new String(message);
       
       @Test
       public void testPrintMessage() {     
          System.out.println("Inside testPrintMessage()");    
          assertEquals(message, messageUtil);     
       }
       @Test
       public void testJournal1() {
           Sandbox o1 = new Sandbox();
           assertEquals("Hello", o1.getStr1());
        }
       @Test
       public void test2() {
            assertEquals("hi", "hi"); 
        }
       @Test
       public void test3() {
            assertEquals(500.2, 500.2, 0.0);  
        }
    @Test
    public void test4() {
         assertEquals(500.22, 500.22, 0.00);  
     }
    public void test5() {
         assertEquals(500.222, 500.222, 0.000);  
     }
    public void test6() {
         assertEquals("Hey", "Hey");  
     }
}
