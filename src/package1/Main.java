
package package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SpaceShip> spaceShip = new ArrayList<>();
    static Scanner entrance = new Scanner (System.in);
    
    public static void main(String[] args) {
       //crear una Nave
       CreateShip();
    }
    public static void CreateShip(){
        char answer;
        int option;
        do{
            do{
                System.out.println("Digite que tipo de Nave quiere crear");
                System.out.println("1. Nave tripulada");
                System.out.println("2. Nave lanzadera");
                System.out.println("3. Nave no tripulada");
                System.out.print("Opcion: ");
                option = entrance.nextInt();
            }while(option<1 || option>3);
            
            switch(option){
                case 1://tripulada
                    break;
                case 2://lanzadera
                    break;
                case 3://no tripulada
                    break;                
            }
            
            System.out.println("\nDesea Crear otra Nave S/N: ");
            answer = entrance.next().charAt(0);
            System.out.println("");
        }while(answer=='s'|| answer=='S');
                
       }
    
    public static void Mostrar(){
        
       for(SpaceShip space: spaceShip){
           System.out.println("termino"+space.type());
       }
    }
}
