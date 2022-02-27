
package package1;
/*
 * Clase principal donde creamos naves espaciales de diferentes tipos.
 * El do while es el ciclo que se repetira hasta que el usuario escoja la opcion diferente a "s" o "S" (Crear naves)
 * El swith case con los tipos de naves a crear y guardarlos en el arreglo dinamico SpaceShip.
 * @Author Yeiner Hidalgo Molina
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<SpaceShip> spaceShip = new ArrayList<>();
    static Scanner entrance = new Scanner (System.in);
    
    public static void main(String[] args) {
     /**
       *
       * Crear una Nave
       */
       CreateShip();
       
     /**
       *
       * Mostrar metodos abstractos Type(Tipo), purpose(Proposito)
       */
       ShowAbstractMethods();
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
                case 1 -> CreateMannedShip(); //tripulada
                case 2 -> CreateShuttleShip(); //lanzadera
                case 3 -> CreateUnmannedShip(); //no tripulada
            }
            
            System.out.print("\nDesea Crear otra Nave (S/N) : ");
            answer = entrance.next().charAt(0);
            System.out.println("");
        }while(answer=='s'|| answer=='S');
                
       }
    /**
     *
     * Nave tripulada
     */
    public static void CreateMannedShip(){
     String name,fuel,country;
     int power;
     double weight;
     float speed;
        entrance.nextLine();
        System.out.println("Digite el Nombre de la Nave: ");
        name = entrance.nextLine();
        System.out.println("Digite la potencia de la Nave: ");
        power = entrance.nextInt();
        entrance.nextLine();
        System.out.println("Digite el combustible que utiliza la Nave: ");
        fuel = entrance.nextLine();
        System.out.println("Digite el peso de la Nave: ");
        weight = entrance.nextDouble();
        System.out.println("Digite la velocidad de la Nave: ");
        speed = entrance.nextFloat();
        entrance.nextLine();
        System.out.println("Digite el pais de la Nave: ");
        country = entrance.nextLine();
     
        MannedShip mannedShip = new MannedShip(name,power,fuel,weight,speed,country);
        
        spaceShip.add(mannedShip);//guardamos la nave dentro del arreglo
    }
    
    /**
     *
     * Nave Lanzadera
     */
    public static void CreateShuttleShip(){
     String name,fuel,country;
     int power;
     double weight;
     float speed;
        entrance.nextLine();
        System.out.println("Digite el Nombre de la Nave: ");
        name = entrance.nextLine();
        System.out.println("Digite la potencia de la Nave: ");
        power = entrance.nextInt();
        entrance.nextLine();
        System.out.println("Digite el combustible que utiliza la Nave: ");
        fuel = entrance.nextLine();
        System.out.println("Digite el peso de la Nave: ");
        weight = entrance.nextDouble();
        System.out.println("Digite la velocidad de la Nave: ");
        speed = entrance.nextFloat();
        entrance.nextLine();
        System.out.println("Digite el pais de la Nave: ");
        country = entrance.nextLine();
     
        ShuttleShip shuttleShip = new ShuttleShip(name,power,fuel,weight,speed,country);
        
        spaceShip.add(shuttleShip);//guardamos la nave dentro del arreglo
    }
    
    /**
     *
     * Nave no tripulada
     */
    public static void CreateUnmannedShip(){
     String name,fuel,country;
     int power;
     double weight;
     float speed;
        entrance.nextLine();
        System.out.println("Digite el Nombre de la Nave: ");
        name = entrance.nextLine();
        System.out.println("Digite la potencia de la Nave: ");
        power = entrance.nextInt();
        entrance.nextLine();
        System.out.println("Digite el combustible que utiliza la Nave: ");
        fuel = entrance.nextLine();
        System.out.println("Digite el peso de la Nave: ");
        weight = entrance.nextDouble();
        System.out.println("Digite la velocidad de la Nave: ");
        speed = entrance.nextFloat();
        entrance.nextLine();
        System.out.println("Digite el pais de la Nave: ");
        country = entrance.nextLine();
     
        UnmannedShip unmannedShip = new UnmannedShip(name,power,fuel,weight,speed,country);
        
        spaceShip.add(unmannedShip);//guardamos la nave dentro del arreglo
    }
    /**
     *
     * Recorriendo el arreglo para mostrar las naves creadas
     */
     public static void ShowAbstractMethods(){
         for (SpaceShip space : spaceShip){
             System.out.println(space.toString());
             System.out.println("Tipo de nave = "+space.type());
             System.out.println("El proposito de la nave es = "+space.purpose());
             System.out.println("");
         }
     }
}
