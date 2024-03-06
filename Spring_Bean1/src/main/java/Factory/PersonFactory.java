package Factory;

import Dao.PersonDao;
import Dao.PersonDaoImpl;

/**
 * @author GG_B
 * @version 1.0
 */
public class PersonFactory {
    public PersonDao getPerson(){
        return new PersonDaoImpl();
    }
}
