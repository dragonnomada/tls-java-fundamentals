package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TiendaTerminalDB extends TiendaTerminal {

    protected Connection connection;

    public TiendaTerminalDB(Scanner scanner) throws Exception {
        super(scanner);

        Class.forName("com.mysql.cj.jdbc.Driver");

        /*
        * host: 192.168.1.219:3306
        * db: tienda
        * user: tienda
        * password: TLSjava1
        */
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://192.168.1.219:3306/tienda",
                "tienda", "TLSjava1");

        System.out.println("Conectado a la base de datos");
    }

    private void obtenerProductosBD() {
        try {
            String sql = "SELECT * FROM productos";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            productos.clear();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int existencias = resultSet.getInt("existencias");
                super.agregarProducto(new Producto(id, nombre, precio, existencias));
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los productos desde la base de datos");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String generarReporte() {
        this.obtenerProductosBD();
        return super.generarReporte();
    }

    @Override
    public void agregarProducto(Producto producto) {
        super.agregarProducto(producto);
        try {
            String sql = "INSERT INTO productos " +
                    "(id, nombre, precio, existencias) " +
                    "VALUES (?, ?, ?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setLong(1, producto.getId());
            statement.setString(2, producto.getNombre());
            statement.setDouble(3, producto.getPrecio());
            statement.setInt(4, producto.getExistencias());
            if (statement.executeUpdate() != PreparedStatement.EXECUTE_FAILED) {
                System.out.println("Producto agregado a la base de datos");
            } else {
                System.out.println("No se pudo agregar el producto a la base de datos");
            }
        } catch (Exception e) {
            System.out.println("Error al agregar el producto a la base de datos");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Producto buscarProducto(long id) {
        try {
            String sql = "SELECT * FROM productos WHERE id=?";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            productos.clear();
            if (resultSet.next()) {
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int existencias = resultSet.getInt("existencias");
                return new Producto(id, nombre, precio, existencias);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los productos desde la base de datos");
            System.out.println(e.getMessage());
        }
        return null;
    }
}
