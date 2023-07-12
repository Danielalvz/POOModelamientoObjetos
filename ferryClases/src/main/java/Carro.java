import java.util.Calendar;

public class Carro extends Vehiculo{
    private boolean esDeTresPuertas;

    public Carro(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento, boolean esDeTresPuertas) {
        super(tipo, numeroPasajeros, tripulacion, ruedas, fechaMatriculacion, medioDesplazamiento);
        this.esDeTresPuertas = esDeTresPuertas;
    }

    public boolean isEsDeTresPuertas() {
        return esDeTresPuertas;
    }

    public void setEsDeTresPuertas(boolean esDeTresPuertas) {
        this.esDeTresPuertas = esDeTresPuertas;
    }

    @Override
    public String toString() {
        String mensaje;
        if(!esDeTresPuertas) {
            mensaje = "Vehiculo con 5 puertas";
        } else {
            mensaje = "Vehiculo con 3 puertas";
        }
        return super.toString() +
                ", Puertas = " + mensaje;
    }
}
