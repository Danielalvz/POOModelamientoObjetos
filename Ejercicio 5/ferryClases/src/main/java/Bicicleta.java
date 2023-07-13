import java.util.Calendar;

public class Bicicleta extends Vehiculo{
    private int numeroCambios;

    public Bicicleta(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento, int numeroCambios) {
        super(tipo, numeroPasajeros, tripulacion, ruedas, fechaMatriculacion, medioDesplazamiento);
        this.numeroCambios = numeroCambios;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numeroCambios = " + numeroCambios;
    }
}
