package chapter3.conditionalBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Conditional 中放入一个实现了Condition接口的类
 */
@Configuration
public class Config {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public Magic magicBean() {
        return new Magic();
    }
}
