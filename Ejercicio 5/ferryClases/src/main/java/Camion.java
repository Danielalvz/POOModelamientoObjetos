import java.util.Calendar;

public class Camion extends Vehiculo{
    private double altura;

    public Camion(String tipo, int numeroPasajeros, boolean tripulacion, int ruedas, Calendar fechaMatriculacion, String medioDesplazamiento, double altura) {
        super(tipo, numeroPasajeros, tripulacion, ruedas, fechaMatriculacion, medioDesplazamiento);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", altura = " + altura;
    }
}
