enum TipoPersona {
    HOMBRE,
    MUJER,
    ROBOT,
    ALIENIGENA
}

public class Ejemplo902 {

    public static void main(String[] args) {

        TipoPersona persona = TipoPersona.ROBOT;

        switch (persona) {

            case HOMBRE:
                System.out.println("Hola señorino");
                break;

            case MUJER:
                System.out.println("Hola señorina");
                break;

            case ROBOT:
                System.out.println("101010101010");
                break;

            case ALIENIGENA:
                System.out.println("👽👾🛸🛰️");
                break;

            default:
                System.out.println("??????????");
                break;

        }

    }

}
