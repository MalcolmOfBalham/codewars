package codewars.stringtocamelcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringToCamelCaseTest {

    @Test
    public void test() {
        fail("Not yet implemented");
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    
    
}
