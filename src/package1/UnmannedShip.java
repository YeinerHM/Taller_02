/*
 * Nave no tripulada
 */
package package1;

public class UnmannedShip extends SpaceShip{

    private String name;//Nombre
    private int power;//potencia
    private String fuel;//Combustible
    private double weight;//peso
    private float speed;//velocidad
    private String country;//pais

    public UnmannedShip(String name, int power, String fuel, double weight, float speed, String country) {
        this.name = name;
        this.power = power;
        this.fuel = fuel;
        this.weight = weight;
        this.speed = speed;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre = " + name + "Potencia = " + power + "Combustible = " + fuel + "Peso = " + weight + "Velocidad = " + speed + "Pais = " + country;
    }

    @Override
    public String type() {
        return "Nave no tripulada";
    }

    @Override
    public String purpose() {
        return "Exoloracion espacial";
    }
    
    
}
