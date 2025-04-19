public class Calculator {

    public int addition(int[] nums) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("Two numbers required for addition.");
        return nums[0] + nums[1];
    }

    public int subtraction(int[] nums) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("Two numbers required for subtraction.");
        return nums[0] - nums[1];
    }

    public int multiplication(int[] nums) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("Two numbers required for multiplication.");
        return nums[0] * nums[1];
    }

    public int division(int[] nums) {
        if (nums == null || nums.length < 2)
            throw new IllegalArgumentException("Two numbers required for division.");
        if (nums[1] == 0)
            throw new ArithmeticException("Cannot divide by zero.");
        return nums[0] / nums[1];
    }

    public void fibonacci(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Number of terms must be positive.");
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public int square(int x) {
        return x * x;
    }

    public int cube(int x) {
        return x * x * x;
    }

    public double sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Cannot compute square root of negative number.");
        return Math.sqrt(x);
    }
}