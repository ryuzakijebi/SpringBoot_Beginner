package jebihendardi.springbeginner;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import jebihendardi.springbeginner.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
