public class CodigoR302 {

    public static void main(String[] args) {

        // UPCASTING
        // Tratar a la subclase cómo si fuera la superclase
        // Es decir, un ConvertidorTemperaturaConScanner (`subclase`)
        // se puede utilizar como un ConvertirTemperatura (`superclase`)
        ConvertidorTemperatura convertidor = new ConvertidorTemperaturaFromScanner();

        // Al hacer upcasting el objeto solo puede acceder a los métodos del padre
        // es decir se comporta como la superclase, la cual no tiene
        // los nuevos métodos de la subclase.

        // Para rescatar la referencia un objeto de la superclase
        // a la subclase hacemos un downcasting

        // DOWNCASTING
        // Recuperar la referencia a una subclase, desde la referencia upcasting de una superclase
        ConvertidorTemperaturaFromScanner convertidorFromScanner =
                (ConvertidorTemperaturaFromScanner) convertidor;

        convertidorFromScanner.leerGradosCentigrados();
        System.out.println(convertidorFromScanner);
        System.out.println(convertidor);

        convertidorFromScanner.leerGradosFahrenheit();
        System.out.println(convertidorFromScanner);
        System.out.println(convertidor);

        convertidorFromScanner.leerGradosKelvin();
        System.out.println(convertidorFromScanner);
        System.out.println(convertidor);

    }

}
