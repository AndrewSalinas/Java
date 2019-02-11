public class Recursion {

    static int recFib(int x) { //Method # one of the recursion

        if (x > 1) {
            return recFib(x - 1) + recFib(x - 2);
        }
        return x;
    }


    public static int mult(int m, int x) {

        if (x == 0 || m == 0) {
            return 0;

        }
        else if (x > 0 && m > 0) {

            return m + mult(m, (x - 1));
        }
        return 0;
    }


}