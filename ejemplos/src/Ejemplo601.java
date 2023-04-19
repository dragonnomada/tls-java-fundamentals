public class Ejemplo601 {

    public static void main(String[] args) {

        String reporte = "";

        reporte += "--- Reporte ---\n"; // Equivale a `reporte = reporte + ...`
        reporte += String.format("1 + 2 = %d %n", 1 + 2);
        reporte += String.format("[%d] %s (%.2f) %n", 34, "Hola mundo", 3.1416);

        System.out.println(reporte);
        System.out.println(reporte.length());
        System.out.println(reporte.getBytes());
        System.out.println(reporte.toUpperCase());
        System.out.println(reporte.toLowerCase());
        System.out.println(reporte.charAt(8));
        System.out.println(reporte.substring(4, 10));
        System.out.println(reporte.indexOf("Hola"));
        System.out.println(reporte.contains("[34]"));
        System.out.println(reporte.contains("[35]"));
        System.out.println(reporte.replace("3.14", "XXXX"));

    }

}
