public abstract class Ciclistas {

    private int identificador;
    private String nombre;
    private int tiempoAcumulado=0;

    public Ciclistas(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String imprimirTipo();

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir(){
        System.out.println("Identificador = " +identificador);
        System.out.println("Nombre = " +nombre);
        System.out.println("Tiempo Acumulado = " +tiempoAcumulado);
    }
    
}