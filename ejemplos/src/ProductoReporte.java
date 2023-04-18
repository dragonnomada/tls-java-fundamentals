import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductoReporte {

    Producto producto = null; // referencia a un producto
    // Variable de TIPO CLASE (tipo Producto)
    // Capaz de almacenar una referencia a un objeto de tipo Producto

    // REFERENCIACIÓN: Enlazar referencias a objetos
    ProductoReporte(Producto producto) {
        // producto -> Es un parámetro del constructor (método)
        //             es una referencia a un objeto de tipo Producto

        // this.producto -> Es el atributo de la clase
        //                  capaz de retener una referencia a un objeto de tipo Producto

        // this.producto = producto = <referencia pasada por el constructor>
        // Actualizamos la referencia de el producto.
        this.producto = producto;
    }

    void reporteTerminal() {
        System.out.println("-------------------- PRODUCTO ---------------------");
        System.out.printf("ID: %d %n", this.producto.getId());
        System.out.printf("NOMBRE: %s %n", this.producto.getNombre());
        System.out.printf("DESCRIPCIÓN: %s %n", this.producto.getDescripcion());
        System.out.println("---------------------------------------------------");
        System.out.printf("PRECIO: $%.2f %n", this.producto.getPrecio());
        System.out.printf("EXISTENCIAS: %04d %n", this.producto.getExistencias());
        System.out.println("---------------------------------------------------");
    }

    String reporteString() {
        StringBuilder builder = new StringBuilder();

        builder.append("-------------------- PRODUCTO ---------------------");
        builder.append("ID: ");
        builder.append(this.producto.getId());
        builder.append("\n");
        builder.append("NOMBRE: ");
        builder.append(this.producto.getNombre());
        builder.append("\n");
        builder.append("DESCIPCIÓN: ");
        builder.append(this.producto.getDescripcion());
        builder.append("\n");
        builder.append("---------------------------------------------------");
        builder.append("\n");
        builder.append("PRECIO: $");
        builder.append(this.producto.getPrecio());
        builder.append("\n");
        builder.append("EXISTENCIAS: ");
        builder.append(this.producto.getExistencias());
        builder.append("\n");
        builder.append("---------------------------------------------------");
        builder.append("\n");

        return builder.toString();
    }

    void reporteFile(File file) throws IOException {

        // TODO: Escribir el reporte en un archivo
        FileWriter fileWriter = new FileWriter(file);

        fileWriter.write(this.reporteString());

        fileWriter.close();

    }

}
