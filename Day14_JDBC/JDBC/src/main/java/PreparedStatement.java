import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GG_B
 * @version 1.0
 */
public class PreparedStatement {
    public static void main(String[] args) {
        // jdbc:表示使用jdbc连接技术
        // mysql://localhost:3306 表示使用的是Mysql数据库协议，访问的是本机端口3306
        String url = "jdbc:mysql://localhost:3306/rg56?serverTimezone=Asia/Shanghai";
        //String url = "jdbc:mysql://localhost:3306/rg56?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "592678030111";
        List<Account> accounts = new ArrayList<>();

        //MySQL8.0
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            Connection connection = DriverManager.getConnection(url,username,password);
            //创建SQL语句执行器
            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM stuno";

            //使用执行器执行查询，得到一个结果集
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){//光标后移
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                //数据库中的列数是从1开始数
                String passwords = resultSet.getString(3);
                System.out.println(id + "," + name + "," + passwords);
                Account account = new Account(id,name,passwords);
                accounts.add(account);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        accounts.forEach(System.out::println);
    }
}
