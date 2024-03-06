/**
 * @author GG_B
 * @version 1.0
 */
public class Finally {
    public static void main(String[] args) {
        int result = getResult();
        System.out.println(result);
    }

    public static int getResult() {
        int number = 10;
        try { //尝试执行
//返回值 => 尝试返回一个结果，但发现后面还有finally模块，而finally模块一定会得到执行。于是在这里只能将
//返回值使用一个临时变量(例如变量a)存储起来。然后再执行finally模块，finally模块执行完之后，再将这个临时
//变量(a)存储的值返回
            return number;
        } catch (Exception e) {
            return 1;
        } finally {
            number++;
        }
    }
}
