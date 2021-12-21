package koschei.config;

import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Needle7;
import koschei.models.Wood3;
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
    public Egg6 getEgg(Needle7 needle7) {
        Egg6 egg = new Egg6();
        egg.setNeedle(needle7);
        return egg;
    }
}
