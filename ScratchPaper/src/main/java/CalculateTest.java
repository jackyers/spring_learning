/**
 * @author GG_B
 * @version 1.0
 */
public class CalculateTest {
    public static void main(String[] args) {
//    定义一个接口计算两个数的和。并在测试类中使用Lambda表达式完成测试

//()中的所有参数类型可以省略
//如果()中有且仅有一个参数，那么()可以省略
//如果{}中有且仅有一条语句，那么{}可以省略，这条语句后的分号也可以省略。如果这条语句是return
//语句，那么return关键字也可以省略
//        Calculate calculate = (double a, double b) -> {
//            return a + b;
//        };
        Calculate calculate = (a,b) -> a + b;
        System.out.println(calculate.calculate(2,6));


    }

}
