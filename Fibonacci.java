public class Fibonacci extends Recursion {

    public static void main(String[] arg) {
        System.out.println(recFib(0));
        System.out.println(recFib(4));
        System.out.println(recFib(7));

        //I'm dumb I wrote them all with
        //Recursion on it instead of
        //adding extends... :System.out.println(Recursion.recFib(7));
    }
}