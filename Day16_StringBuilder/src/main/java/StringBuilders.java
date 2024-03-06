import java.util.Scanner;

/**
 * @author GG_B
 * @version 1.0
 */
public class StringBuilders {
    //现有字符串 ababababababababa ，求其中子字符串 aba 出现的次数（使用String类完成）
    public static void main(String[] args) {
        String s1 = "ababababababababa";
        String target1 = "aba";
        int times = 0;
        for (int i = 0; i <= (s1.length() - target1.length()); i++) {
            String spl = s1.substring(i,i + target1.length());
            if (spl.equals(target1)){
                times++;
            }

        }
        System.out.println(times);

//        将从控制台输入的数字转换为财务数字（10,005.25）(使用 StringBuilder 完成)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串数字");
        double s2 = scanner.nextDouble();
        StringBuilder stringBuilder= new StringBuilder(String.valueOf(s2));
        int point= stringBuilder.indexOf(".");
        if (point > 3){
            for (int i = point - 3; i > 0; i-=3) {
                stringBuilder.insert(i,",");
            }
        }

        System.out.println(stringBuilder);
    }
}
