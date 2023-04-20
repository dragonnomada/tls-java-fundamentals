public class ConvertidorTemperatura {

    private double gradosCentigrados = 0;
    private double gradosFahrenheit = 32;
    private double gradosKelvin = 273;

    public void setGradosCentigrados(double centigrados) {
        this.gradosCentigrados = centigrados;
        this.gradosFahrenheit = 1.8 * centigrados + 32;
        this.gradosKelvin = centigrados + 273;
    }

    public void setGradosFahrenheit(double fahrenheit) {
        this.gradosFahrenheit = fahrenheit;
        this.gradosCentigrados = (fahrenheit - 32) / 1.8;
        this.gradosKelvin = this.gradosCentigrados + 273;
    }

    public void setGradosKelvin(double kelvin) {
        this.gradosKelvin = kelvin;
        this.gradosCentigrados = kelvin - 273;
        this.gradosFahrenheit = 1.8 * this.gradosCentigrados + 32;
    }

    public double getGradosCentigrados() {
        return gradosCentigrados;
    }

    public double getGradosFahrenheit() {
        return gradosFahrenheit;
    }

    public double getGradosKelvin() {
        return gradosKelvin;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "Centigrados=" + String.format("%8.2f", gradosCentigrados) +
                ", Fahrenheit=" + String.format("%8.2f", gradosFahrenheit) +
                ", Kelvin=" + String.format("%8.2f", gradosKelvin) +
                '}';
    }
}
