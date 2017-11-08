package codewars.tenminutewalk;

public class TenMinuteWalk {
	public static boolean isValid(char[] walk) {

		// requirement is to get back to the starting point in 10 minutes
		// so check that there are exactly 10 instructions
		if (walk.length != 10) {
			System.out.println("Must be exactly 10 directions");
			return false;
		}

		//define x and y co-ords for our positions, starting at 0,0
		int xpos = 0;
		int ypos = 0;
		
		//now process the directions. Per instructions will always be valid directions
		for (char direction : walk) {
			switch (direction) {
			case 'n':
				ypos++;
				break;
			case 's':
				ypos--;
				break;
			case 'e':
				xpos++;
				break;
			case 'w':
				xpos--;
				break;

			}

		}

		// now return true if back where we started
		System.out.println(String.format("xpos:%d ypos %d", xpos, ypos));
		return (xpos == 0 && ypos == 0);
	}
}
