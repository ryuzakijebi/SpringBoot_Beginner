package jebihendardi.springbeginner;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import jebihendardi.springbeginner.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
