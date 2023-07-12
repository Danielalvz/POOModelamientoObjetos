import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class sistemaPlanetario {
    public static void main(String[] args) {
        final double masaSol = Planetas.sol.getMasa();
        double masaPlaneta;
        double distanciaPlaneta;
        double fuerzaGravitatoria;
        int opcion = 0;
        String planeta;
        List<CuerpoCeleste> sistemaPlanetario = Planetas.listarSistemaPlanetario();
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al programa del sistema planetario");
        System.out.println("Conoceras información muy util");

        while(opcion != 5) {
            System.out.println("Por favor ingrese la opción que desee realizar:");
            System.out.println("1 ver planetas del sistema planetario");
            System.out.println("2 calcular atracción gravitatoria entre dos cuerpos");
            System.out.println("3 listar planetas según su peso de mayor a menor");
            System.out.println("4 listar planetas según distancia mas cercana al Sol");
            System.out.println("5 salir del sistema");
            opcion= in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1: //Sistema planetario
                    System.out.println("\nSistema planetario: ");
                    for (CuerpoCeleste sistema : sistemaPlanetario) {
                        System.out.println(sistema);
                    }
                    break;
                case 2: //Calcular atracción gravitatoria entre dos cuerpos
                    System.out.println("Por favor ingrese el planeta que desea conocer su atracción gravitatoria");
                    planeta = in.nextLine();

                    CuerpoCeleste planetaElegido = CuerpoCeleste.buscarPlaneta(sistemaPlanetario, planeta);
                    masaPlaneta = Objects.requireNonNull(planetaElegido).getMasa();
                    distanciaPlaneta = planetaElegido.getDistanciaAlSol();

                    System.out.println("Fuerza gravitacional de " + planetaElegido.getNombre() + " y el sol");
                    fuerzaGravitatoria = CuerpoCeleste.calcularAtraccionGravitatoria(masaPlaneta, masaSol, distanciaPlaneta);
                    System.out.println(fuerzaGravitatoria + " Newton");
                    break;
                case 3: //Planetas según su peso
                    CuerpoCeleste.ordenarPlanetaPorPeso(sistemaPlanetario);
                    break;
                case 4: //Planetas según distancia
                    CuerpoCeleste.ordenarPlanetaPorDistanciaAlSol(sistemaPlanetario);
                    break;
                case 5:
                    System.out.println("Esta saliendo del sistema..");
                    System.out.println("Gracias por visitar el sistema planetario");
                    break;
            }
        }
    }
}
