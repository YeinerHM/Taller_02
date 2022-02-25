
package package1;

/**
 *Mapa
 *Esta sera la clase adtract principal
 * @author yeine
 */
public abstract class SpaceShip {
    
    protected String name;//nombre
    
    public int power;//potencia
    
    protected String fuel;//combustible
    
    protected double weight;//peso de la nave
    
    protected float speed;//Velocidad
    
    protected String country;//pais
    
    protected int capacity;//capacidad de carga o pasajeros

    //metodo constructor
    public SpaceShip(String name, int power, String fuel, double weight, float speed, String country, int capacity) {
        this.name = name;
        this.power = power;
        this.fuel = fuel;
        this.weight = weight;
        this.speed = speed;
        this.country = country;
        this.capacity = capacity;
    }
    
    //metodos getters

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getFuel() {
        return fuel;
    }

    public double getWeight() {
        return weight;
    }

    public float getSpeed() {
        return speed;
    }

    public String getCountry() {
        return country;
    }

    public int getCapacity() {
        return capacity;
    }
    
    //metodo toString mostrar datos
    @Override
    public String toString() {
        return "Nombre =" + name + "potencia=" + power + "combustible =" + fuel + "peso =" + weight + "Velocida =" + speed + "pais =" + country + "capacidad de carga =" + capacity;
    }
    
    //metodo abstract
    public abstract String type();
    public abstract String destination();
}
