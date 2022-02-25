/*
 * Nave tripulada
 */
package package1;


public class MannedShip extends SpaceShip{

    public MannedShip(String name, int power, String fuel, double weight, float speed, String country, int capacity) {
        super(name, power, fuel, weight, speed, country, capacity);
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String type() {
        return "";
    }

    @Override
    public String destination() {
        return "";
    }
    
}
