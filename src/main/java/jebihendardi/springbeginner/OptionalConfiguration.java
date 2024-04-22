package jebihendardi.springbeginner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jebihendardi.springbeginner.data.Bar;
import jebihendardi.springbeginner.data.Foo;
import jebihendardi.springbeginner.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

  @Bean
  public Foo foo(){
    return new Foo();
  }

  @Bean
  public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
    return new FooBar(foo.orElse(null), bar.orElse(null));
  }

}
