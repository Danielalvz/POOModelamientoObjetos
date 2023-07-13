import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CuerpoCeleste {
    private double masa;
    private double densidad;
    private double diametro; //KM
    private double distanciaAlSol;
    private final int id;
    private String nombre;

    public CuerpoCeleste(double masa, double densidad, double diametro, double distanciaAlSol, int id, String nombre) {
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.id = id;
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double calcularAtraccionGravitatoria(double masaPlanetaA, double masaPlanetaB, double distancia) {
        final double constanteGravitacional = 6.67430e-11;
        double fuerzaGravitacional = (constanteGravitacional * (masaPlanetaA * masaPlanetaB)) / (distancia * distancia);
        return fuerzaGravitacional;
    }

    public static void ordenarPlanetaPorPeso(List<CuerpoCeleste> sistema) {
        Collections.sort(sistema, (CuerpoCeleste a, CuerpoCeleste b) -> Double.compare(b.getMasa(), a.getMasa()));

        System.out.println("\nPlanetas según su peso de mayor a menor:");
        for (CuerpoCeleste sistemas : sistema) {
            System.out.println(sistemas.getNombre() + " - Peso: " + sistemas.getMasa() + " k");
        }
    }

    public static void ordenarPlanetaPorDistanciaAlSol(List<CuerpoCeleste> sistema) {
        Collections.sort(sistema, (CuerpoCeleste a, CuerpoCeleste b) -> Double.compare(a.getDistanciaAlSol(), b.getDistanciaAlSol()));

        System.out.println("\nPlanetas según su distancia al sol, comenzando con los mas cercanos:");
        for (CuerpoCeleste sistemas : sistema) {
            System.out.println(sistemas.getNombre() + " - Distancia: " + sistemas.getDistanciaAlSol() + " km");
        }
    }

    public static CuerpoCeleste buscarPlaneta(List<CuerpoCeleste> sistema, String planeta) {
        Scanner in = new Scanner(System.in);

        while (true) {
            if (planeta.isEmpty()) {
                System.out.println("El nombre del planeta no puede estar vacío. Inténtalo nuevamente.");
                planeta = in.nextLine();
                continue;
            }

            for (CuerpoCeleste sistemas : sistema) {
                if (sistemas.getNombre().equalsIgnoreCase(planeta)) {
                    System.out.println("Planeta encontrado: " + sistemas.getNombre());
                    return sistemas;
                }
            }

            System.out.println("El planeta '" + planeta + "' no fue encontrado en el sistema. Inténtalo nuevamente.");
            planeta = in.nextLine();
        }
    }


    @Override
    public String toString() {
        return "\nCuerposCelestes{" +
                "Masa=" + masa + " k,\n" +
                "Densidad promedio=" + densidad + " gr/cm3,\n" +
                "Diametro=" + diametro + " km,\n" +
                "Distancia al Sol=" + distanciaAlSol + "km,\n" +
                "Id=" + id + ",\n" +
                "Nombre='" + nombre + '\'' +
                '}';
    }
}
