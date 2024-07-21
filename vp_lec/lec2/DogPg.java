/** A sandbox class for Java Array play. Practicing a few different ways
 * to do the job would be good. Arrays vs ArrayLists, recursive vs iterative,
 * are just a couple different varieties in this exercise. */
public class DogPg() {

	public static int[] largerThanFourNeighbors(int[] nms) {
		//use a helper? multiple ways. recursion? :D
		/** Useful params: length of current array, number of neighbors to satisfy */

		return fourHelper(nms, 4, 0);
	}
	/** Workhorse for lt4. Note: building an array, esp. recursively, reqs a bit more
	 * code in java. */
	public static int[] fourHelper(int[] crr, k, ix) {
		/** Can put inside largerThan? python yes, java... oi.
		 * What params should the helper take? Maybe the k=4
		 * We may also want to pass the final output array along?*/
		 if (ix >= crr.length) { return [];}
		 if (k == 0) {
		 	return [crr[ix]];
		 } else if (ix - k < 0 || crr[ix] > crr[ix - k]) {
		 	if (ix + k > crr.length || crr[ix] > crr[ix]) {
		 		return fourHelper(crr, k - 1, ix);
		 	}
		 }
		 return fourHelper(crr, 4, ix + k);
	}


	public static int[] largerThanKNeighbors(int[] nms, int k) {
		// ; Recursive/cool code way first. Then... runtime (dynamic prog?)

	}
	public static void main(String[] args) {
		// should output [20, 22]
		int[] tst1 = new int[]{10, 15, 20, 15, 10, 5, 10, 15, 22, 20};
		System.out.println(largerThanFourNeighbors(tst1));

	}
}