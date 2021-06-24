
package Personajes;
import java.util.*;
import Principal.Menu;
import Juego.Ente;
public class Bestia {
    String[]verBestias={"Orco","Trasgo"};
    int[]verVidaBestia={300,325};
    
    //Menu menu = new Menu();
    Scanner entrada=new Scanner(System.in);
    Ente ente=new Ente();
    
    public int contadorBestia=1;
    
    public void crearBestia(){
       // menu.CaracteristicasHeroes();
        System.out.println("Ingrese el numero de ID del tipo de Heroe que desea crear");
        int opCrear=entrada.nextInt();
        if (opCrear==1){
            crearOrco();
            ente.tipoPersonajeBestia[contadorBestia]="Orco";
        }else if(opCrear==2){
            crearDrazgo();
            ente.tipoPersonajeBestia[contadorBestia]="Drazgo";
        }
    contadorBestia++;
    }
    
    public void crearOrco(){
        ente.idBestia[contadorBestia]=contadorBestia;
        System.out.println("Ingrese el Nombre del Nuevo Personaje");
        ente.nombreBestia[contadorBestia]=entrada.next();
        System.out.println("Es una Bestia "+ente.bestia);
        ente.vidaBestia[contadorBestia]=300;
        ente.muertoBestia[contadorBestia]=false;
    }
    
    public void crearDrazgo(){
        ente.idBestia[contadorBestia]=contadorBestia;
        System.out.println("Ingrese el Nombre del Nuevo Personaje");
        ente.nombreBestia[contadorBestia]=entrada.next();
        System.out.println("Es una Bestia "+ente.bestia);
        ente.vidaBestia[contadorBestia]=325;
        ente.muertoBestia[contadorBestia]=false;
    }
    
    public void CaracteristicasBestias(){

        System.out.println("++++CARACTERISTICAS BESTIAS++++");
        for(int j=0;j<2;j++){
            System.out.println("ID: "+j+" Personaje:"+verBestias[j]+ " Vida:"+verVidaBestia[j]);
        }
        System.out.println("\n");
    }
    
    public void mostrarEjercitoBestias(){
        System.out.println(" EJERCITO BESTIAS");
        for(int i=1;i<contadorBestia;i++){
            System.out.println(ente.bestia+"    ID:"+ente.idBestia[i]+" Nombre:"+ente.nombreBestia[i]+" Personaje:"+ente.tipoPersonajeBestia[i]+" Vida:"+ente.vidaBestia[i]);
        }
        entrada.nextLine();
    }
}
