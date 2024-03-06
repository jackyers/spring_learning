package Pojo;

/**
 * @author GG_B
 * @version 1.0
 */
public class plane {
    private String name;
    private String brand;
    private double price;
    private Factory factory;

    public plane() {
    }

    public plane(String name, String brand, double price, Factory factory) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "plane{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", factory=" + factory +
                '}';
    }
}
