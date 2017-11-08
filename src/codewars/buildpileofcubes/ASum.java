package codewars.buildpileofcubes;

/*Your task is to construct a building which will be a pile of n cubes. 
 * The cube at the bottom will have a volume of n^3, the cube above will 
 * have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.

You are given the total volume m of the building. 
Being given m can you find the number n of cubes you will have to build?

The parameter of the function findNb (find_nb, find-nb, findNb) will
 be an integer m and you have to return the integer n 
 
 such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
*/

public class ASum {
	public static long findNb(long m) {

		long buildingVolume = m;

		// iterative solution to find num of cubes for the volume.
		// start low, go up in 100s and then tune the increment
		// to zero in on the number.
		int numCubes = 50;
		int increment = 100;
		boolean numCubesFound = false;
		while (true) {
			long calculatedVolume = calcVolume(numCubes);
			System.out.println(String.format("numCubes %d calculatedVol %d targetVol %d lastIncrement %d", numCubes,
					calculatedVolume, buildingVolume, increment));

			if (calculatedVolume == buildingVolume) {
				numCubesFound = true;
				break;
			} else if (((calculatedVolume > buildingVolume) && (increment == 1))
					|| ((calculatedVolume < buildingVolume) && (increment == -1))) {
				// if the number is 'unreachable' will end up oscillating
				// around 1/-1 increments, so prevent
				numCubesFound = false;
				break;
			} else {
				increment = getNextIncrement(buildingVolume, calculatedVolume, increment);
				numCubes += increment;
			}
		}
		if (numCubesFound) {
			return numCubes;
		} else {
			return -1;
		}

	}

	public static int getNextIncrement(long targetVol, long calcVol, int lastIncrement) {
		// go up in 100s by default. if overshoot, go back by 50, 25 etc.
		int nextIncrement;
		if (calcVol > targetVol) {
			if (lastIncrement > 1) {
				nextIncrement = -1 * lastIncrement / 2;
			} else {
				// lastIncrement already negative.. keep going
				nextIncrement = lastIncrement;
			}
		} else {
			// calculated volume is less than target volume
			// keep going in same direction if were incrementing
			if (lastIncrement >= 1) {
				nextIncrement = lastIncrement;
			} else {
				// we were coming backwards, but went too far
				nextIncrement = -1 * lastIncrement / 2;
			}
		}
		return nextIncrement;
	}

	public static long calcVolume(int numCubes) {
		// initially just doing the easy way to picture the problem
		// so for n cubes, the bottom one is n^3, until top 1 is 1^3
		// so if 3 cubes, would be 3^3, 2^3, 1^3

		System.out.println(String.format("CalcVolume for %d cubes", numCubes));
		long buildingVolume = 0;
		for (int i = 1; i <= numCubes; i++) {
			long blockVolume = (long) Math.pow(i, 3);
			buildingVolume += blockVolume;
			// System.out.println(String.format("Block %d Volume %d total volume %d", i,
			// blockVolume, buildingVolume));
		}

		return buildingVolume;
	}
}
