package zyh.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author GG_B
 * @version 1.0
 */
@ConfigurationProperties(prefix = "car")//批量进行属性绑定
public class Car {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
