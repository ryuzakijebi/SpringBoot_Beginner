package jebihendardi.springbeginner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import jebihendardi.springbeginner.data.Bar;
import jebihendardi.springbeginner.data.Foo;
import jebihendardi.springbeginner.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {

  @Bean
  @Scope("prototype")
  public Foo foo(){
    log.info("Create new Foo");
    return new Foo();
  }

  @Bean
  public CustomScopeConfigurer customScopeConfigurer(){
    CustomScopeConfigurer configurer = new CustomScopeConfigurer();
    configurer.addScope("doubleton", new DoubletonScope());
    return configurer;
  }

  @Bean
  @Scope("doubleton")
  public Bar bar(){
    log.info("Create new Bar");
    return new Bar();
  }
}
