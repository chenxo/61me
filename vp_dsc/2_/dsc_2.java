public class dsc_2 {
	public static int mystery(int[] inputArray, int k) {
		int x = inputArray[k];
		int answer = k;
		int index = k + 1;
		while (index < inputArray.length) {
			if (inputArray[index] < x) {
				x = inputArray[index];
				answer = index;
			}
			index = index + 1;
		}
		return answer;
	}

	public static void mystery2(int[] inputArray) {
		int index = 0;
		while (index < inputArray.length) {
			int targetIndex = mystery(inputArray, index);
			int temp = inputArray[targetIndex];
			inputArray[targetIndex] = inputArray[index];
			inputArray[index] = temp;
			index = index + 1;
		}
	}

	public static int fib(int n) {
		System.out.print("& ");
		if (n <= 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static int fib2(int n, int k, int f0, int f1) {
		System.out.print("* ");
		if (k <= 1) {
			return f0;
		} else if (k == 2) {
			return f1;
		}
		return fib2(n, k - 1, f1, f0 + f1);
		// if (k == n){
		// 	return 0;	// return f0;
		// } else if (k == 1){ // else { return fib2(n, k + 1, f1, f0 + f1)} /* came close to staff below*/
		// 	return 1
		// }
		// return fib2(n, k + 1, f0 + f1,) + f1
	}
	public static void main(String[] args) {
		int[] inArr0 = {3,0,4,6,3};
		int k0 = 2;
		System.out.println("Result of mystery on [3, 0, 4, 6, 3] and k = 2:\n" + mystery(inArr0, k0));
		mystery2(inArr0);
		System.out.println("Result of mystery2 on same array (no k paramter):");
		for (int i_: inArr0)
		System.out.print(i_ + " ");

		System.out.println("See if fib2 makes less recursive calls: ");
		//System.out.println("Result of fib(4) == 2? " + fib(4));
		//System.out.println("Result of fib(5) == 3? " + fib(5));
		System.out.println("Result of fib(9) == 21? " + fib(9));

		System.out.println("Result of fib2(9) == 21? " + fib2(9, 9, 0, 1));
	}
}