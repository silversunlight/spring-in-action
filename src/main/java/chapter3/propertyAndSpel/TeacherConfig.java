package chapter3.propertyAndSpel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("chapter3properties.properties")
public class TeacherConfig {
    @Autowired
    Environment env;

    @Bean
    @Qualifier("dominica")
    public Teacher getDominica() {
        return new Dominica(env.getProperty("dominica.name", "default"),
                env.getProperty("dominica.age", "default"));
    }

    @Bean
    @Qualifier("notexists")
    public Teacher getDefault() {
        return new Dominica(env.getProperty("notexists.name", "default"),
                env.getProperty("notexists.age", "default"));
    }

    //env.getProperty(),有重载方法，可以直接转换属性所属的类
    //这里就把string直接转化成了Integer
    @Bean
    @Qualifier("casey")
    public Teacher getCasey() {
        return new Casey(env.getProperty("casey.name"),
                env.getProperty("casey.age", Integer.class));
    }

    //env.getRequiredProperty(),如果不存在这个属性的话，会抛出IllegalStateException
    @Bean
    @Qualifier("ria")
    public Teacher getRia() {
        return new Ria(env.getRequiredProperty("ria.name"),
                env.getRequiredProperty("ria.age"));
    }

    //使用占位符的话，需要实现一个PropertySourcesPlaceholderConfigurer Bean
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    //使用占位符注入
    @Bean
    @Qualifier("mira")
    public Teacher getMira(@Value("${mira.name}") String name,
                           @Value("${mira.age}") String age) {
        return new Mira(name, age);
    }

    //todo 使用spEL注入

}
