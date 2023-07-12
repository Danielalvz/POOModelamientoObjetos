import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, a = 0;
        int totalPasajeros = 0, cantidadVehiculos = 0;

        Scanner scanner = new Scanner(System.in);
        InventarioVehiculos inventario = new InventarioVehiculos();

        List<Vehiculo> ferry = inventario.inventarioVehiculos();
        Vehiculo[] vehiculos = new Vehiculo[10];

        System.out.println("Bienvenido al ferry");
        while(opcion != 3) {
            System.out.println("\nIngrese la opción que desee realizar: ");
            System.out.println("1 para ver los vehiculos actualmente en el embarque");
            System.out.println("2 para agregar vehiculo al embarque");
            System.out.println("3 para salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Estos son los vehiculos que estan actualmente en la embarcación:");
                    System.out.println(ferry);

                    System.out.println("\nCantidad de vehiculos: " + ferry.size());
                    int pasajerosFerry = Vehiculo.calcularTotalPasajeros(ferry);
                    System.out.println("Cantidad de pasajeros: " + pasajerosFerry);

                    System.out.println("\nInventario de vehiculos nuevos ingresados");
                    System.out.println(Arrays.toString(vehiculos));

                    for (Vehiculo vehiculo : vehiculos) {
                        if (vehiculo != null) {
                            totalPasajeros += vehiculo.getNumeroPasajeros();
                            cantidadVehiculos += 1;
                        }
                    }
                    System.out.println("\nCantidad total de pasajeros nuevos: " + totalPasajeros);
                    System.out.println("Cantidad de vehiculos nuevos: " + cantidadVehiculos);

                    System.out.println("\nCantidad total de pasajeros en embarque: " + (totalPasajeros + pasajerosFerry));
                    System.out.println("Total de vehiculos en embarque: " + (ferry.size() + cantidadVehiculos));
                    break;
                case 2:
                    System.out.println("Ingresar datos de 10 vehículos:");

                    if (a < vehiculos.length) {
                        crearVehiculo(vehiculos, a);
                        a++;
                    }
                    break;
                case 3:
                    System.out.println("Esta saliendo del programa..");
                    System.out.println("Gracias por visitar el Ferry!");
                    break;
                default:
                    System.out.println("Esta opción no esta disponible, digite una correcta");
            }
        }
    }
    public static void crearVehiculo(Vehiculo[] vehiculos, int a) {
        String respuesta;
        boolean bandera = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vehículo #" + (a + 1));

        System.out.print("Número de pasajeros: ");
        int numeroPasajeros = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea

        System.out.print("¿Tiene tripulación? (true/false): ");
        boolean tieneTripulacion = scanner.nextBoolean();

        System.out.print("Número de ruedas: ");
        int numeroRuedas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Fecha de matriculación, ");
        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();
        System.out.println("Ingrese el mes en número: ");
        int mes = scanner.nextInt();
        mes--;
        System.out.println("Ingrese el dia: ");
        int dia = scanner.nextInt();
        scanner.nextLine();
        Calendar fecha = new GregorianCalendar(anio, mes, dia);

        System.out.print("Medio de desplazamiento, terrestre o maritimo: ");
        String medioDesplazamiento = scanner.nextLine();

        do {
            bandera = false;
            System.out.println("Tipo de vehiculo (carro, camion, bicicleta, moto, lancha): ");
            String tipo = scanner.nextLine().toLowerCase();

            switch (tipo) {
                case "carro":
                    System.out.println("Su carro es de 3 puertas? digite true o false:");
                    boolean puertas = scanner.nextBoolean();
                    scanner.nextLine();

                    vehiculos[a] = new Carro(tipo, numeroPasajeros, tieneTripulacion, numeroRuedas, fecha, medioDesplazamiento, puertas);
                    break;
                case "moto":
                    System.out.println("Su moto es de cilindraje alto? digite true o false:");
                    boolean cilindrajeAlto = scanner.nextBoolean();
                    scanner.nextLine();

                    vehiculos[a] = new Moto(tipo, numeroPasajeros, tieneTripulacion, numeroRuedas, fecha, medioDesplazamiento, cilindrajeAlto);
                    break;
                case "camion":
                    System.out.println("Que altura tiene su camion en cm?");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();

                    vehiculos[a] = new Camion(tipo, numeroPasajeros, tieneTripulacion, numeroRuedas, fecha, medioDesplazamiento, altura);
                    break;
                case "bicicleta":
                    System.out.println("Digite la cantidad de cambios que tiene su bicicleta: ");
                    int cambios = scanner.nextInt();
                    scanner.nextLine();

                    vehiculos[a] = new Bicicleta(tipo, numeroPasajeros, tieneTripulacion, numeroRuedas, fecha, medioDesplazamiento, cambios);
                    break;
                case "lancha":
                    System.out.println("Digite cuanta potencia tiene el motor de su lancha en kW: ");
                    int potenciaMotor = scanner.nextInt();
                    scanner.nextLine();

                    vehiculos[a] = new Lancha(tipo, numeroPasajeros, tieneTripulacion, numeroRuedas, fecha, medioDesplazamiento, potenciaMotor);
                    break;
                default:
                    System.out.println("Este tipo de vehiculo no esta disponible, selecciono uno dentro de los parámetros.");
                    bandera = true;
            }
        } while (bandera);

        System.out.println("Vehiculo almacenado con éxito.");

        System.out.println("Quiere conocer la antiguedad de la fecha de matriculación de su vehiculo?");
        System.out.println("Digite si o no");
        respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.println(vehiculos[a].calcularAntiguedad());
        } else if(respuesta.equals("no")) {
            System.out.println("Proceso terminado.");
        } else {
            System.out.println("Opción no valida.");
        }
    }
}
