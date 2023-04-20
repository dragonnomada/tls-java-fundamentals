public class CodigoR301 {

    public static void main(String[] args) {

        ConvertidorTemperatura convertidor = new ConvertidorTemperatura();

        System.out.println(convertidor);

        convertidor.setGradosCentigrados(43);

        System.out.println(convertidor);

        convertidor.setGradosFahrenheit(125);

        System.out.println(convertidor);

        convertidor.setGradosKelvin(212);

        System.out.println(convertidor);

    }

}
