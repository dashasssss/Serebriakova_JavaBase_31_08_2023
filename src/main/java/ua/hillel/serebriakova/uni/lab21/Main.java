import java.util.Arrays;

public class Main {

    // Function to calculate the Lagrange polynomial for the given points and x
    public static double lagrangePolynomial(double[] x, double[] y, double point) {
        int n = x.length;
        double result = 0.0;

        for (int i = 0; i < n; i++) {
            double term = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    term *= (point - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] x = {11, 13, 15};  // Given x values
        double[] y = new double[x.length];  // Calculate y values for given x

        // Calculate y values for the given function f(x) = (lnx)^β
        double beta = 109;
        for (int i = 0; i < x.length; i++) {
            y[i] = Math.pow(Math.log(x[i]), beta);
        }

        double point = 12.5;  // Point where we want to calculate the Lagrange polynomial
        double lagrangeResult = lagrangePolynomial(x, y, point);

        System.out.println("Lagrange polynomial at x = " + point + " is: " + lagrangeResult);

        // New nodes for interpolation
        double x3 = x[2] - 0.5;
        double x4 = x3 + 1.5;
        double[] newX = Arrays.copyOf(x, x.length + 2);
        double[] newY = Arrays.copyOf(y, y.length + 2);
        newX[3] = x3;
        newX[4] = x4;
        newY[3] = Math.pow(Math.log(x3), beta);
        newY[4] = Math.pow(Math.log(x4), beta);

        // Calculate Lagrange polynomial for the new nodes
        double newLagrangeResult = lagrangePolynomial(newX, newY, point);

        // Calculate the absolute error
        double absoluteError = Math.abs(lagrangeResult - newLagrangeResult);

        System.out.println("Lagrange polynomial at x = " + point + " with new nodes is: " + newLagrangeResult);
        System.out.println("Absolute error: " + absoluteError);
    }
}

