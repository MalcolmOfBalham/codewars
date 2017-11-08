package codewars.tenminutewalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenMinuteWalkTest {

	@Test
	public void testIsValidWalk() {
//		TenMinuteWalk tmw = new TenMinuteWalk();
/*		assertFalse(tmw.isValid(new String[] { "s", "n" }));
		assertTrue(tmw.isValid(new String[] { "s", "n", "s", "n", "s", "n", "s", "n", "s", "n" }));
		assertFalse(tmw.isValid(new String[] { "w", "w", "w", "w", "w", "s", "s", "s", "s", "s" }));
		assertTrue(tmw.isValid(new String[] { "s", "s", "w", "w", "n", "n", "n", "e", "e", "s" }));
*/
		assertEquals("Should return true", true, TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
	    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
	    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'w'}));
	    assertEquals("Should return false", false, TenMinuteWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
		
	}

}
