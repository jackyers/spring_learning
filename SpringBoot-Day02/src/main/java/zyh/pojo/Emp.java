package zyh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GG_B
 * @version 1.0
 */
@Data  //get set toString 方法就已经有了
@AllArgsConstructor  //定义有参数的构造函数
@NoArgsConstructor  //定义无参数的构造函数
public class Emp {
    private String name;
    private Integer age;
}
