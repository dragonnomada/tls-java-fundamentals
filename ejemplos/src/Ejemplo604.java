public class Ejemplo604 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Hola");
        builder.append(" ");
        builder.append("mundo");
        builder.append(" ");
        builder.append("🗺️");
        builder.append("\n");
        builder.append(123);
        builder.append(" ");
        builder.append(88 + 77);
        builder.append("\n");
        builder.append(true);
        builder.append("\n");
        builder.append("...");

        String texto = builder.toString();

        System.out.println(texto);

    }

}
