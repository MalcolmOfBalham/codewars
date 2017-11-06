package codewars.tenminutewalk;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenMinuteWalkTest {

	@Test
	public void testIsValidWalk() {
		TenMinuteWalk tmw = new TenMinuteWalk();
		assertFalse(tmw.isValidWalk(new String[] { "s", "n" }));
		assertTrue(tmw.isValidWalk(new String[] { "s", "n", "s", "n", "s", "n", "s", "n", "s", "n" }));
		assertFalse(tmw.isValidWalk(new String[] { "w", "w", "w", "w", "w", "s", "s", "s", "s", "s" }));
		assertTrue(tmw.isValidWalk(new String[] { "s", "s", "w", "w", "n", "n", "n", "e", "e", "s" }));

	}

}
