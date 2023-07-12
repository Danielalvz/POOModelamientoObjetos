import java.util.Scanner;
import java.util.Vector;

public class vectorNumeros {
    public static void run() {
        Vector<Integer> numeros = new Vector<Integer>();
        leerNumeros(numeros);
    }

    private static void leerNumeros(Vector<Integer> numeros) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean bandera = true;

        System.out.println("Este es un programa de lectura de números por teclado, y su almacenamiento en un Vector.");
        System.out.println("Si quieres finalizar el programa debes digitar un número ya digitado.");
        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            numeros.add(numero);

            //Si dos numeros son iguales se termina el ciclo y se muestra el vector
            if (numeros.size() > 1) {
                for (int i = 0; i < numeros.size()-1; i++) {
                    if (numeros.get(i) == numero) {
                        bandera = false;

                        mostrarNumeros(numeros);
                    }
                }
            }
        } while (bandera);
    }

    private static void mostrarNumeros(Vector<Integer> numeros) {
        System.out.println("Números introducidos:");
        System.out.println(numeros.toString());
    }
}
