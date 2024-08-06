package org.zyh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author GG_B
 * @version 1.0
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Demo1 {

    @Value("${uname}")
    private String uname;

    @Value("${age}")
    private Integer age;

}
