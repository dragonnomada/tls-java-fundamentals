public class Ejemplo306 {

    public static void main(String[] args) {

        double a = 1.23;
        double b = 4.56;

        double c = a + b;
        double d = a * b;
        double e = b / a;
        double f = Math.pow(a, b);
        double g = b * Math.sin(a);

        System.out.println(
                "c = " + c + "\n" +
                "d = " + d + "\n" +
                "e = " + e + "\n" +
                "f = " + f + "\n" +
                "g = " + g + "\n"
        );

    }

}
