import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Vehiculo {
    private String tipo;
    private int numeroPasajeros;
    private boolean tripulacion;
    private int ruedas;
    private Calendar fechaMatriculacion;
    private String medioDesplazamiento;

    public Vehiculo(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento) {
        this.tipo = tipo;
        this.numeroPasajeros = numeroPasajeros;
        this.tripulacion = tripulacion;
        this.ruedas = ruedas;
        this.fechaMatriculacion = fechaMatriculacion;
        this.medioDesplazamiento = medioDesplazamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public boolean isTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(boolean tripulacion) {
        this.tripulacion = tripulacion;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public Calendar getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Calendar fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMedioDesplazamiento() {
        return medioDesplazamiento;
    }

    public void setMedioDesplazamiento(String medioDesplazamiento) {
        this.medioDesplazamiento = medioDesplazamiento;
    }

    public String formatearFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fechaMatriculacion.getTime());
        return  fechaFormateada;
    }

    public static int calcularTotalPasajeros(List<Vehiculo> vehiculos) {
        int totalPasajeros = 0;

        for (Vehiculo vehiculo : vehiculos) {
            totalPasajeros += vehiculo.getNumeroPasajeros();
        }

        return totalPasajeros;
    }

    public String calcularAntiguedad() {
        Calendar fechaActual = Calendar.getInstance();
        int anioActual = fechaActual.get(Calendar.YEAR);
        int anioMatriculacion = fechaMatriculacion.get(Calendar.YEAR);
        int antiguedad = anioActual - anioMatriculacion;

        int mesActual = fechaActual.get(Calendar.MONTH);
        int mesMatriculacion = fechaMatriculacion.get(Calendar.MONTH);

        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
        int diaMatriculacion = fechaMatriculacion.get(Calendar.DAY_OF_MONTH);

        int antiguedadMeses = Math.abs(mesActual - mesMatriculacion);
        int antiguedadDias = Math.abs(diaActual - diaMatriculacion);

        return "Antiguedad matriculación vehiculo: " + antiguedad + " años, " + antiguedadMeses + " meses, y " + antiguedadDias + " dias.";
    }

    @Override
    public String toString() {
        return "\n'Vehiculo{" +
                "tipoVehiculo = " + tipo +
                ", numeroPasajeros = " + numeroPasajeros +
                ", tripulacion = " + tripulacion +
                ", ruedas = " + ruedas +
                ", fechaMatriculacion = " + formatearFecha() +
                ", medioDesplazamiento = '" + medioDesplazamiento + '\'' +
                '}';
    }
}
