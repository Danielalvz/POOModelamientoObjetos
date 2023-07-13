import java.util.Calendar;

public class Lancha extends Vehiculo{
    private int potenciaMotor;

    public Lancha(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento, int potenciaMotor) {
        super(tipo, numeroPasajeros, tripulacion, ruedas, fechaMatriculacion, medioDesplazamiento);
        this.potenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", potenciaMotor = " + potenciaMotor + "kW";
    }
}
