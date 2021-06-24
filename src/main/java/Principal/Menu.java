/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.*;
import Personajes.Heroe;
import Personajes.Bestia;
public class Menu {
    public static void main (String []args){
        Heroe heroe=new Heroe();
        Bestia bestia=new Bestia();
        Scanner entrada=new Scanner(System.in);
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
                heroe.mostrarEjercitoHeroes();
                bestia.mostrarEjercitoBestias();
                break;
            case 2:
                System.out.println("    1. Crear Heroe");
                System.out.println("    2. Crear Bestia");
                System.out.println("Ingrese el numero de opcion que desea ejecutar");
                int op=entrada.nextInt();
                if(op==1){
                    heroe.crearHeroe();
                }else if(op==2){
                    bestia.crearBestia();
                }else{
                    System.out.println("Vuelva a intentarlo e ingrese un aopcion valida");
                }
                break;
            case 3:
                heroe.CaracteristicasHeroes();
                bestia.CaracteristicasBestias();
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
  }
           
  
    
    
    

