package config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: PowerRuleConfig
 * @author: ganquanzhong
 * @date: 2020/5/11 15:46
 */

@Configuration
public class OrderRuleConfig {

    @Bean
    public IRule iRule(){
        //单独配置  Order服务模块的 IRule
        return new RandomRule();
    }
}
