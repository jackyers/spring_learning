import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author GG_B
 * @version 1.0
 */
public class PreparedStatement2 {
    public static void main(String[] args) {
        // jdbc:表示使用jdbc连接技术
        // mysql://localhost:3306 表示使用的是Mysql数据库协议，访问的是本机端口3306
        String url = "jdbc:mysql://localhost:3306/rg56?serverTimezone=Asia/Shanghai";
        //String url = "jdbc:mysql://localhost:3306/rg56?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "592678030111";
        List<Account> accounts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
            System.out.println("请输入商品名称");
        int goodsName = Integer.parseInt(scanner.nextLine());

        //MySQL8.0
            try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接
            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "select * from stuno where id = ?";
            //创建SQL预处理执行器
            java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //设置占位符替换的值
            preparedStatement.setInt(1,goodsName);
            //使用执行器执行查询，得到一个结果集
            ResultSet resultSet = preparedStatement.executeQuery();

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
            preparedStatement .close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
            accounts.forEach(System.out::println);
    }
}
