public class CodigoS401 {

    public static void main(String[] args) {

        // UPCASTING
        IPunto2D punto1 = new Circulo(3, 4, 10);
        IPunto2D punto2 = new Circulo(4, -1, 3);
        IPunto2D punto3 = new Coordena2D(99.5, -112.3);
        IPunto2D punto4 = new Coordena2D(86.5, 34.567);

        System.out.println(punto1.getX() + ", " + punto1.getY());
        System.out.println(punto2.getX() + ", " + punto2.getY());
        System.out.println(punto3.getX() + ", " + punto3.getY());
        System.out.println(punto4.getX() + ", " + punto4.getY());


    }

}
