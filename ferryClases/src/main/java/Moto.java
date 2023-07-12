import java.util.Calendar;

public class Moto extends Vehiculo{
    private boolean cilindrajeAlto;

    public Moto(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento, boolean cilindrajeAlto) {
        super(tipo, numeroPasajeros, tripulacion, ruedas, fechaMatriculacion, medioDesplazamiento);
        this.cilindrajeAlto = cilindrajeAlto;
    }

    public boolean isCilindrajeAlto() {
        return cilindrajeAlto;
    }

    public void setCilindrajeAlto(boolean cilindrajeAlto) {
        this.cilindrajeAlto = cilindrajeAlto;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", esDeCilindrajeAlto = " + cilindrajeAlto;
    }
}
