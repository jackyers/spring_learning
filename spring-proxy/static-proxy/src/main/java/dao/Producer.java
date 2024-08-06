package dao;

/**
 * @author GG_B
 * @version 1.0
 */
public class Producer implements ProductDao{
    public void buyProduct(String name) {
        System.out.println(name + "生产了飞机。");
    }
}
