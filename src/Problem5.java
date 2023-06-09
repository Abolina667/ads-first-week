import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findFibonacci(n));
    }

    /**
     * findFibonacci - this method calculates Fibonacci sequence of the n number
     * @param n - the integer to calculate for
     * @return - return the value of the n in Fibonacci
     * */
    public static int findFibonacci(int n){
        if(n == 1)
            return 1;
        if(n == 0)
            return 0;
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
