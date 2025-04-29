
public class Main {

    public static void main(String[] args) {
        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("\nLa temperatura de %1.1f grados Celsius es equivalente a %3.3f grados Fahrenheit.\n", temperaturaEnCelsius, temperaturaEnFahrenheit);
        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit en grados enteros es: " + temperaturaEnFahrenheitEntero);
    }
}
