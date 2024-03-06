package Pojo;

/**
 * @author GG_B
 * @version 1.0
 */
public class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    public Factory() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }
}
