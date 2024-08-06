package zyh.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import zyh.pojo.ObjectA;

/**
 * @author GG_B
 * @version 1.0
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回值是需要导入类的全限定名的数组
        return new String[]{ObjectA.class.getName()};
    }
}
