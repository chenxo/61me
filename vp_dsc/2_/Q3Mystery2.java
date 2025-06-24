public class Q3Mystery2 {
    //class or instance variables
    
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

    // mystery2... from the first index (0th) 'currindex' mystery2 will
    // take the min value and swap it to the 'currindex'
    // then go to the next index and repeat. effectively sorting the array
    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index); // get index of min val at or after currindex pos
            int temp = inputArray[targetIndex]; // store min value in temp var
            inputArray[targetIndex] = inputArray[index]; // put currindex val at loc of min
            inputArray[index] = temp; // put min value at currindex
            index = index + 1; // go to next pos in array
        }
    }
    
    // test class
    public static void main(String[] args) {
        int[] test_arr = {3,0,4,6,3};
        mystery2(test_arr);
        for (int el : test_arr) {
            System.out.println(el);
        }
    }
}
