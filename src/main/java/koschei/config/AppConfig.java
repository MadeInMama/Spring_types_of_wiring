package koschei.config;

import koschei.models.Island2;
import koschei.models.Oak3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {
    @Bean
    public static Island2 getIsland(Oak3 wood) {
        return new Island2(wood);
    }
}
