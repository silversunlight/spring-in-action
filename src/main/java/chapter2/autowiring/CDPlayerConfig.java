package chapter2.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ComponentScan注解
 * 如果想要设置扫描的包
 * @ComponentScan("chapter2.autowiring)
 * 如果想更清晰的表明设置的是基础包
 * @ComponentScan(basePackages="chapter2.autowiring")
 * 想要设置多个包的话
 * @ComponentScan(basePackages={"chapter2.autowiring","chapter1"})
 * 上面的例子中，所设置的基础包是以String类型表示的，如果重构了代码
 * 所指定的基础包可能就会发生错误
 * @ComponentScan(basePackageClasses={CDPlayer.class,DVDPlayer.class})
 */
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
