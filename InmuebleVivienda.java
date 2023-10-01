
public class InmuebleVivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanos;

    //Metodo Constructor.

    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    //los Set and Get.

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(int numeroBanos) {
        this.numeroBanos = numeroBanos;
    }
    
}