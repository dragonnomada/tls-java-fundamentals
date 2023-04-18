import java.util.ArrayList;

public class CodigoR101 {

    public static void main(String[] args) {

        int edad = 18;

        int[] edades = new int[5];

        edades[0] = 23;
        edades[1] = 55;
        edades[2] = 17;
        edades[3] = 24;
        edades[4] = 98;
        //edades[5] = 13; // ERROR: Fuera de rango

        ArrayList objetos = new ArrayList();

        objetos.add(4.5);
        objetos.add(3.2);
        objetos.add(2.7);

        for (Object elemento : objetos) {
            double valor = (double) elemento;
            System.out.printf("El valor es: %.2f %n", valor);
        }

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Paquito");
        nombres.add("Pedrito");
        nombres.add("Pepito");
        //nombres.add(123); // ERROR: No coincide el tipo asociado

        // int -> Tipo de dato
        // Integer -> Clase de tipo int

        // double -> Tipo de dato
        // Double -> Clase de tipo double

        ArrayList<Integer> calificaciones = new ArrayList<>();

        calificaciones.add(10);
        //calificaciones.add(7.5); // ERROR: No coincide con Integer
        //calificaciones.add("Pepe"); // ERROR: No coincide con Integer
        calificaciones.add("Pepe".length()); // ERROR: No coincide con Integer

        int x = 123;

        boolean trabaja = true;

        String texto = "Hola mundo 🗺️";

        texto = texto.replace('o', 'x');

        System.out.println(texto);

    }

}
