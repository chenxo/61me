/** Compilation javac Q2Mystery.java
 * Execution: java Q2Mystery
 * Dependencies:
 *
 * % java Q2Mystery {3,0,4,6,3}, 2
 * mystery({3,0,4,6,3}, 2); => 4
 */
public class Q2Mystery {
    // class or instance variables?

    //methods

    // mystery returns the index of the smallest element in the array 
    // located at or after the k-th index of the array
    public static int mystery(int[] inputarray, int k) {
        int x = inputarray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputarray.length) {
            if (inputarray[index] < x) {
                x = inputarray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
     }

    // test client
    public static void main(String[] args) {
        int[] test_arr = {3,0,4,6,3};
        int out = mystery(test_arr, 2);
        System.out.println("out: " + out);
    }
}
