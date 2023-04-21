package tests;

import models.TiendaTerminal;

import java.util.Scanner;

public class TiendaTerminalTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TiendaTerminal tiendaTerminal = new TiendaTerminal(scanner);

        tiendaTerminal.mostrarMenuTienda();

    }

}
