public class Contrarelojista  extends Ciclistas{
    private double velocidadMáxima;

    public Contrarelojista(int identificador, String nombre, double velocidadMáxima) {
        super(identificador, nombre);
        this.velocidadMáxima = velocidadMáxima;
    }

    public double getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(double velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Velocidad Máxima = " +velocidadMáxima);
    }
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}