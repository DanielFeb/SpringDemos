package indi.daniel.anttstage.config;

import indi.daniel.anttstage.beans.Dancer;
import indi.daniel.anttstage.beans.IPerformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daniel on 2017/2/28.
 */
@Configuration
public class BeansConfiguration {
    @Bean
    public IPerformer dancer(){
        Dancer dancerLee = new Dancer();
        dancerLee.setName("Lee");
        return dancerLee;
    }
}
