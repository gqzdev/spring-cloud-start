package config;

import com.gqzdev.rule.MyLBRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: PowerRuleConfig
 * @author: ganquanzhong
 * @date: 2020/5/11 15:46
 */

@Configuration
public class PowerRuleConfig {

    @Bean
    public IRule iRule(){
        //使用自定义的rule
        return new MyLBRule();
    }
}
