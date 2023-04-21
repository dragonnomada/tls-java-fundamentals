package views;

import models.Producto;
import models.Tienda;
import models.TiendaTerminalDB;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.Scanner;

public class TiendaUI extends TiendaTerminalDB {

    JFrame frame;
    JPanel panel;
    JTable table;

    public TiendaUI(Scanner scanner) throws Exception {
        super(scanner);

        this.frame = new JFrame();
        this.panel = new JPanel();
        this.table = new JTable();

        this.panel.add(this.table);
        this.frame.add(this.panel);

        this.frame.setSize(600, 400);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.generarReporte();

        this.frame.setVisible(true);

    }

    @Override
    public String generarReporte() {
        String reporte = super.generarReporte();
        ArrayList<Producto> productos = this.productos;
        this.table.setModel(new TableModel() {
            @Override
            public int getRowCount() {
                return productos.size();
            }

            @Override
            public int getColumnCount() {
                return 4;
            }

            @Override
            public String getColumnName(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return "ID";
                    case 1:
                        return "NOMBRE";
                    case 2:
                        return "PRECIO";
                    case 3:
                        return "EXISTENCIAS";
                    default:
                        return "????";
                }
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return Long.class;
                    case 1:
                        return String.class;
                    case 2:
                        return Double.class;
                    case 3:
                        return Integer.class;
                    default:
                        return String.class;
                }
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return productos.get(rowIndex).getId();
                    case 1:
                        return productos.get(rowIndex).getNombre();
                    case 2:
                        return productos.get(rowIndex).getPrecio();
                    case 3:
                        return productos.get(rowIndex).getExistencias();
                    default:
                        return "????";
                }
            }

            @Override
            public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

            }

            @Override
            public void addTableModelListener(TableModelListener l) {

            }

            @Override
            public void removeTableModelListener(TableModelListener l) {

            }
        });
        return reporte;
    }
}
