
public class Main {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Jumbo", "Bélgica");
        Escalador escalador1 = new Escalador(5678, "Nairo Quintana", 20, 15);
        Contrarelojista contrarelojista1 = new Contrarelojista(1357, "Esteban Chavez", 120);
        Velocista velocista1 = new Velocista(1234, "Peter Sagan", 50, 70);
       
        equipo1.añadirCiclistas(escalador1);
        equipo1.añadirCiclistas(contrarelojista1);
        equipo1.añadirCiclistas(velocista1);
        
        equipo1.listarEquipo();
         
        //HOLA
    }
}