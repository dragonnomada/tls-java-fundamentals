public class Ejemplo304 {

    public static void main(String[] args) {

        String nombre = "Ana Ming";
        int edad = 27;
        float peso = 45.8f;
        double estatura = 1.78951234;
        boolean casado = false;
        char grupo = 'A';
        byte codigo = 17;

        StringBuilder builder = new StringBuilder();

        builder.append("NOMBRE: ");
        builder.append(nombre);
        builder.append("\n");

        builder.append("EDAD: ");
        builder.append(edad);
        builder.append(" años\n");

        builder.append("PESO: ");
        builder.append(peso);
        builder.append(" kilogramos\n");

        builder.append("ESTATURA: ");
        builder.append(estatura);
        builder.append(" metros\n");

        builder.append("CASADO?: ");
        builder.append(casado);
        builder.append("\n");

        builder.append("GRUPO: ");
        builder.append(grupo);
        builder.append("\n");

        builder.append("CÓDIGO: ");
        builder.append(codigo);
        builder.append("\n");

        System.out.println(builder.toString());

    }

}
