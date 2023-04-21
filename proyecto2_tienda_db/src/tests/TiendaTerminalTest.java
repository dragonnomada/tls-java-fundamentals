package tests;

import models.TiendaTerminal;
import models.TiendaTerminalDB;

import java.util.Scanner;

public class TiendaTerminalTest {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        TiendaTerminal tiendaTerminal = new TiendaTerminalDB(scanner);

        tiendaTerminal.mostrarMenuTienda();

    }

}
