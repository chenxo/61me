public class Q4fib {

    public static int fib(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        int[] test_n = {1,2,3,4,5, 9};
        for (int i : test_n) {
            System.out.print("i: " + i + " fib(i): ");
            System.out.print(fib(i));
            System.out.println("");
        }
    }
}
