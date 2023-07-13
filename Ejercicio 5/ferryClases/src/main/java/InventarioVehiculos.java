import java.util.*;

public class InventarioVehiculos {
    Calendar fecha;
    public List<Vehiculo> inventarioVehiculos() {
        List<Vehiculo> ferry = new ArrayList<>();

        ferry.add(carroRojo);
        ferry.add(camionNegro);
        ferry.add(camionAzul);
        ferry.add(lanchaAmarilla);
        ferry.add(lanchaRoja);
        ferry.add(carroVerde);
        ferry.add(biciletaNegra);
        ferry.add(motoNegra);
        ferry.add(remolqueBlanco);
        ferry.add(motoAzul);

        return ferry;
    }
    Vehiculo carroRojo = new Vehiculo(
            "Carro",
            2,
            true,
            4,
            fecha = new GregorianCalendar(2023, Calendar.JANUARY,1),
            "Terrestre"
    );
    Vehiculo camionNegro = new Vehiculo(
            "Camión",
            0,
            false,
            6,
            fecha = new GregorianCalendar(2022, Calendar.APRIL,10),
            "Terrestre"
    );
    Vehiculo camionAzul = new Vehiculo(
            "Camión",
            1,
            true,
            8,
            fecha = new GregorianCalendar(2023, Calendar.MARCH,7),
            "Terrestre"
    );
    Vehiculo lanchaAmarilla = new Vehiculo(
            "Lancha",
            0,
            false,
            0,
            fecha = new GregorianCalendar(2023, Calendar.FEBRUARY,11),
            "Marítimo"
    );
    Vehiculo lanchaRoja = new Vehiculo(
            "Lancha",
            1,
            true,
            0,
            fecha = new GregorianCalendar(2023, Calendar.JANUARY,18),
            "Marítimo"
    );
    Vehiculo carroVerde = new Vehiculo(
            "Carro",
            3,
            true,
            4,
            fecha = new GregorianCalendar(2022, Calendar.MAY,14),
            "Terrestre"
    );
    Vehiculo biciletaNegra = new Vehiculo(
            "Bicicleta",
            1,
            true,
            2,
            fecha = new GregorianCalendar(2023, Calendar.JUNE,1),
            "Terrestre"
    );
    Vehiculo motoNegra = new Vehiculo(
            "Moto",
            0,
            false,
            2,
            fecha = new GregorianCalendar(2021, Calendar.DECEMBER,12),
            "Terrestre"
    );
    Vehiculo remolqueBlanco = new Vehiculo(
            "Remolque",
            1,
            true,
            6,
            fecha = new GregorianCalendar(2022, Calendar.NOVEMBER,22),
            "Terrestre"
    );
    Vehiculo motoAzul = new Vehiculo(
            "Moto",
            0,
            false,
            2,
            fecha = new GregorianCalendar(2022, Calendar.OCTOBER,28),
            "Terrestre"
    );
}
