
package Personajes;
import Principal.Menu;
public class Heroe {
  Heroe heroe =new Heroe();
    public Heroe(){
    }
    int contadorHeroes=0;
    
    public void crearHeroe(){
        System.out.println("-----CREAR HEROE-----");
        for(int i=0;i<3;i++){
            System.out.println("Personaje:"+verHeroes[i]+ " Vida:"+verVidaHeroe[i]);
        }
    }
}
