public class FactorialFinder {
    public static void main(String[] args) {
        int number = 5; 

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = findFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    public static long findFactorial(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
