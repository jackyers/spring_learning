/**
 * @author GG_B
 * @version 1.0
 */
public class Car {
    private String brand;
    private int price;
    private Engine engine;


    public Car(String brand, int price) {
        this.brand = brand;
        this.engine = new Engine("国产",200);
        this.price = price + engine.price;
    }
    public Car(String brand,
               int price,
               Engine engine) {
        this.brand = brand;
        this.engine = engine;
        this.price = price + engine.price;
    }
    public void showEngine(){
        this.engine.show();
    }

    class Engine{
        private String brand;
        private int price;

        public Engine(String brand, int price) {
            this.brand = brand;
            this.price = price;
        }

        public void show(){
            System.out.println(Car.this.brand + "汽车使用的是价值" + price + "的" + brand + "发动机");
            System.out.println("汽车总价为" + Car.this.price);
        }
    }
}
