/*
 * Nave Lanzadera
 */
package package1;

public class ShuttleShip extends SpaceShip{

    public ShuttleShip(String name, int power, String fuel, double weight, float speed, String country, int capacity) {
        super(name, power, fuel, weight, speed, country, capacity);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getFuel() {
        return fuel;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String type() {
        return "Lanzadera";
    }

    @Override
    public String purpose() {
        return "Vehiculo de despegue";
    }
    
}
