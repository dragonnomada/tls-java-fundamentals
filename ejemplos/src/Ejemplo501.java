import java.io.File;
import java.io.IOException;

public class Ejemplo501 {

    public static void main(String[] args) {

        Producto coca = new Producto(123, "Coca cola", "Refresco de cola 600ml", 34.5, 100);

        Producto pepsi = new Producto(456, "Pepsi", 45.6, 23);

        Producto x = new Producto(444);

        ProductoReporte reportadorCoca = new ProductoReporte(coca);

        reportadorCoca.reporteTerminal();

        ProductoReporte reportePecsi = new ProductoReporte(pepsi);

        reportePecsi.reporteTerminal();

        try {
            reportePecsi.reporteFile(new File("D:\\data\\pecsi.txt"));
        } catch (Exception e) {
            System.out.println("No se pudo escribir el archivo ... (pepsi)");
        }

        ProductoReporte reporteX = new ProductoReporte(x);

        String contenido = reporteX.reporteString();

        System.out.println(contenido.length() * 1000);

    }

}
