package Factory;

import Dao.OrderDaoImpl;

/**
 * @author GG_B
 * @version 1.0
 */
public class OrderFactory {
    public static OrderDaoImpl getOrder(){
        return new OrderDaoImpl();
    }
}
