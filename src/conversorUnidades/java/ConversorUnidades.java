package conversorUnidades.java;

public class ConversorUnidades {

    
    /**
     * Convierte grados Celsius a Fahrenheit
     * @param celsius Temperatura en grados Celsius
     * @return Temperatura en grados Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Método main opcional para pruebas
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
