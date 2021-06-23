/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.*;
public class Menu {

 
    public static void main (String []args){
        Menu menu = new Menu();
    }
           Scanner entrada=new Scanner(System.in);
    public Menu(){
        Inicio();
    }
    
    public void Inicio(){
    System.out.println("++++BIENVENIDO A EL SEÑOR DE LOS ANILLOS+++++");
    System.out.println("\n");
    System.out.println("+++++TODO LISTO PARA COMENZAR+++++++++");
    
    int banderaMenu=1;
    do{
        int opMenu;
        System.out.println("-----------MENU---------------");
        System.out.println("    1. BATALLA");
        System.out.println("    2. CREAR PERSONAJE");
        System.out.println("    3. CARACTERISTICAS PERSONAJES");
        System.out.println("    4. SALIR");
        opMenu=entrada.nextInt();
        switch(opMenu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                Caracteristicas();
                break;
            case 4:
                banderaMenu=0;
                break;
            default: 
                System.out.println("Por favor ingresa una opcion válida");
                break;
        
    }
    }while(banderaMenu!=0);
    }
    
    public void Caracteristicas(){
        String[] verHeroes={"Elfo","Hobbit","Humano"};
        int[]verVidaHeroe={250,200,180,};
        String[]verBestias={"Orco","Trasgo"};
        int[]verVidaBestia={300,325};
        
        System.out.println("-----Tabla de caracteristicas de personajes-----");

        System.out.println("++++CARACTERISTICAS HEROES++++");
        for(int i=0;i<3;i++){
            System.out.println("Personaje:"+verHeroes[i]+ " Vida:"+verVidaHeroe[i]);
        }
        System.out.println("\n");
        System.out.println("++++CARACTERISTICAS BESTIAS++++");
        for(int j=0;j<2;j++){
            System.out.println("Personaje:"+verBestias[j]+ " Vida:"+verVidaBestia[j]);
        }
        System.out.println("\n");
    }
}
