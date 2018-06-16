package chapter4.concert;

import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ImportResource("chapter4concert.xml")
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }


}
