/**
 * @author GG_B
 * @version 1.0
 */
public class Account {
    private int id;
    private String name;
    private String password;

    public Account() {
    }

    public Account(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
