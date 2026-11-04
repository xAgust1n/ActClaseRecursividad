
package actrecursividadclase;

public class ActRecursividadClase {

    public static int suma(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + suma(n - 1);
    }

    public static String invertir(String texto) {
        if (texto.length() <= 1) {
            return texto;
        }
        return invertir(texto.substring(1)) + texto.charAt(0);
    }

    public static int contarDigitos(int numero) {
        if (numero > -10 && numero < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10);
    }

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Suma");
        System.out.println("Resultado: " + suma(5));

        System.out.println("\nEjercicio 2: Invertir String");
        System.out.println("Resultado: " + invertir("Murcielago"));

        System.out.println("\nEjercicio 3: Contar digitos");
        System.out.println("Resultado: " + contarDigitos(78951));
    }
}
