import java.util.Scanner;

public class ConvertidorTemperaturaFromScanner extends ConvertidorTemperatura {

    Scanner scanner = new Scanner(System.in);

    public void leerGradosCentigrados() {
        System.out.print("Grados centígrados: ");
        double centigrados = this.scanner.nextDouble();
        this.scanner.nextLine();
        super.setGradosCentigrados(centigrados);
    }

    public void leerGradosFahrenheit() {
        System.out.print("Grados fahrenheit: ");
        double fahrenheit = this.scanner.nextDouble();
        this.scanner.nextLine();
        super.setGradosFahrenheit(fahrenheit);
    }

    public void leerGradosKelvin() {
        System.out.print("Grados kelvin: ");
        double kelvin = this.scanner.nextDouble();
        this.scanner.nextLine();
        super.setGradosKelvin(kelvin);
    }

}
