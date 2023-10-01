public class Escalador extends Ciclistas {
    private double aceleraciónPromedio;
    private double gradoRampa;
    public Escalador(int identificador, String nombre, double aceleraciónPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleraciónPromedio = aceleraciónPromedio;
        this.gradoRampa = gradoRampa;
    }
    /**
     * 
     */
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleración Promedio = "+aceleraciónPromedio);
        System.out.println("Grados de rampa = " +gradoRampa);
    }
    protected String imprimirTipo(){
        return "Es un escalador";
    }
    
}
