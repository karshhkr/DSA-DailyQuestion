class Solution {
    public double myPow(double x, int n) {
       long power = n;
        return helper(x, power);
    }

    private double helper(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            return 1.0 / helper(x, -n);
        }

        double half = helper(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return x * half * half;
    }
}