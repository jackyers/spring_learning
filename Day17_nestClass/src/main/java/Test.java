/**
 * @author GG_B
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("奔驰",500);
        c1.showEngine();

        Car.Engine engine = new Car("红旗", 150).new Engine("进口", 400);

        Car c2 = new Car("海马",350,engine);
        c2.showEngine();
    }
}
