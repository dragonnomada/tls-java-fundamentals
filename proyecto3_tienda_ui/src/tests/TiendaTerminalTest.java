package tests;

import models.TiendaTerminal;
import models.TiendaTerminalDB;
import views.TiendaUI;

import java.util.Scanner;

public class TiendaTerminalTest {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //TiendaTerminal tiendaTerminal = new TiendaTerminal(scanner);
        //TiendaTerminal tiendaTerminal = new TiendaTerminalDB(scanner);
        TiendaTerminal tiendaTerminal = new TiendaUI(scanner);

        tiendaTerminal.mostrarMenuTienda();

    }

}
