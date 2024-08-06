package org.zyh.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author GG_B
 * @version 1.0
 */
@Component
@Data
@ConfigurationProperties(prefix = "person.pet")
public class Pet {
    private String name;
    private Double weight;
}
