package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public Needle7 getNeedle7(Deth8 deth8) {
        return new Needle7(deth8);
    }

    @Bean
    public Egg6 getEgg6() {
        return new Egg6();
    }
}
