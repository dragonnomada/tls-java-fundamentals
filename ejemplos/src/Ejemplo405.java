import java.util.ArrayList;

public class Ejemplo405 {

    public static void main(String[] args) {

        ArrayList frutas = new ArrayList();

        frutas.add("Manzana");
        frutas.add("Kiwi");
        frutas.add("Melón");
        frutas.add("Mango");
        frutas.add("Pera");

        for (Object fruta : frutas) {
            System.out.println(fruta);
        }

    }

}
