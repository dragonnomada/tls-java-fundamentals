import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodigoS202 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\data\\hola.txt");

        FileWriter writer = new FileWriter(file);

        writer.write("Hola mundo mundial 🗺️");
        writer.write("\n");
        writer.write("Este es un ejemplo 🐙");

        writer.close();

    }

}
