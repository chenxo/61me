/** A sandbox class for Java Array play. Practicing a few different ways
 * to do the job would be good. Arrays vs ArrayLists, recursive vs iterative,
 * are just a couple different varieties in this exercise. */
public class Less4() {

	public static int[] largerThanFourNeighbors(int[] nms) {
		//use a helper? multiple ways. recursion? :D
		/** Useful params: length of current array, number of neighbors to satisfy */

		return fourHelper(nms, 4, 0);
	}

	public static int[] helpFour(int[] crr, ix, kmax, dist) {
		/** check at dist = 0, dist' = 1, ... dist = k 
		 * advantage: if we fail on dist = k0, we can jump by k0? yes.
		 * pf: suppose k passes on dist = k0 - 1, but fails on k0. then a[k0] > a[ix] > a[k0-1]
		 * **/
		 int[] tmp; // may be helpful
		 if (dist > kmax || True) { // replace True for success
		 	out = helpFour(crr, ix + kmax + 1, kmax, 1);
		 	tmp = new int[out.length + 1];
			//enter code for this new array. 	

		 }
	}

	// /** Workhorse for lt4. Note: building an array, esp. recursively, reqs a bit more
	//  * code in java. */
	// public static int[] fourHelper(int[] crr, k, ix) {
	// 	/** Can put inside largerThan? python yes, java... oi.
	// 	 * What params should the helper take? Maybe the k=4
	// 	 * We may also want to pass the final output array along?*/
	// 	 if (ix >= crr.length) { return [];}
	// 	 if (k == 0) {
	// 	 	return [crr[ix]];
	// 	 } else if (ix - k < 0 || crr[ix] > crr[ix - k]) {
	// 	 	if (ix + k > crr.length || crr[ix] > crr[ix]) {
	// 	 		int[] tmp = fourHelper(crr, k - 1, ix);

	// 	 	}
	// 	 }
	// 	 return fourHelper(crr, 4, ix + k);
	// }


	public static int[] largerThanKNeighbors(int[] nms, int k) {
		// ; Recursive/cool code way first. Then... runtime (dynamic prog?)

	}
	public static void main(String[] args) {
		// should output [20, 22]
		int[] tst1 = new int[]{10, 15, 20, 15, 10, 5, 10, 15, 22, 20};
		System.out.println(largerThanFourNeighbors(tst1));

	}
}