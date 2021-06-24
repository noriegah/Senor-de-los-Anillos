
package Personajes;
//import Principal.Menu;
import Juego.Ente;
import Juego.Juego;
import java.util.*;
public class Heroe{

     String[] verHeroes={"Elfo","Hobbit","Humano"};
     int[]verVidaHeroe={250,200,180,};
     Scanner entrada=new Scanner(System.in);
     Ente ente=new Ente();
     Juego juego=new Juego();

    public int contadorHeroes=1;
    public void crearHeroe(){
        System.out.println("Ingrese el numero de ID del tipo de Heroe que desea crear");
        int opCrear=entrada.nextInt();
        if (opCrear==1){
            crearElfo();
            ente.tipoPersonajeHeroe[contadorHeroes]="Elfo";
        }else if(opCrear==2){
            crearHobbit();
            ente.tipoPersonajeHeroe[contadorHeroes]="Hobbit";
        }else if(opCrear==3){
            crearHumano();
            ente.tipoPersonajeHeroe[contadorHeroes]="Humano";
        }
    contadorHeroes++;
    }
    
    public void crearElfo(){
        ente.idHeroe[contadorHeroes]=contadorHeroes;
        System.out.println("Ingrese el Nombre del Nuevo Personaje");
        ente.nombreHeroes[contadorHeroes]=entrada.next();
        System.out.println("Es un Heroe "+ente.heroe);
        ente.vidaHeroe[contadorHeroes]=250;
        ente.muertoHeroe[contadorHeroes]=false;
    }
    
    public void crearHobbit(){
        ente.idHeroe[contadorHeroes]=contadorHeroes;
        System.out.println("Ingrese el Nombre del Nuevo Personaje");
        ente.nombreHeroes[contadorHeroes]=entrada.next();
        System.out.println("Es un Heroe "+ente.heroe);
        ente.vidaHeroe[contadorHeroes]=200;
        ente.muertoHeroe[contadorHeroes]=false;
    }
    
    public void crearHumano(){
        ente.idHeroe[contadorHeroes]=contadorHeroes;
        System.out.println("Ingrese el Nombre del Nuevo Personaje");
        ente.nombreHeroes[contadorHeroes]=entrada.next();
        System.out.println("Es un Heroe "+ente.heroe);
        ente.vidaHeroe[contadorHeroes]=180;
        ente.muertoHeroe[contadorHeroes]=false;
    }
    
     public void CaracteristicasHeroes(){

        System.out.println("++++CARACTERISTICAS HEROES++++");
        for(int i=0;i<3;i++){
            System.out.println("ID: "+i+" Personaje:"+verHeroes[i]+ " Vida:"+verVidaHeroe[i]);
        }
                System.out.println("\n");
    }
     
     public void mostrarEjercitoHeroes(){
        System.out.println(" EJERCITO HEROES");
        for(int i=1;i<contadorHeroes;i++){
            System.out.println(ente.heroe+"    ID:"+ente.idHeroe[i]+" Nombre:"+ente.nombreHeroes[i]+" Personaje:"+ente.tipoPersonajeHeroe[i]+" Vida:"+ente.vidaHeroe[i]);
        }
        entrada.nextLine();
    }

         int potenciaAtaqueHeroe;
    public void Batalla1(){
        System.out.println("-------INICIA LA BATALLA--------");
        System.out.println("TURNO NUMERO 1");
        System.out.println(ente.nombreBestia[1]+ente.nombreHeroes[1]);
        System.out.println(contadorHeroes);
        for(int i=1; i<contadorHeroes; i++){
        System.out.println("Lucha entre "+ente.nombreHeroes[i]+"(vida="+ente.vidaHeroe[i]+") y "+ente.nombreBestia[i]+" (vida="+ente.vidaBestia[i]+")");
        int dado1=((int)(Math.random()*100));
        int dado2=((int)(Math.random()*100));
        if(dado1>dado2){
        potenciaAtaqueHeroe=dado1;
        }else if(dado1<dado2){
        potenciaAtaqueHeroe=dado2;
        }else{
        potenciaAtaqueHeroe=dado1;
        }
        ente.vidaBestia[i]=ente.vidaBestia[i]-potenciaAtaqueHeroe;
        int dado3=((int)(Math.random()*90));
        ente.vidaHeroe[i]=ente.vidaHeroe[i]-dado3;
        if(potenciaAtaqueHeroe>=ente.vidaBestia[i]){
            System.out.println("Una Bestia a muerto");
            ente.muertoBestia[i]=true;
        }
        if(dado3>=ente.vidaHeroe[i]){
            System.out.println("Un Heroe a muerto");
            ente.muertoHeroe[i]=true;
        }
        }

    }
     
     
}
