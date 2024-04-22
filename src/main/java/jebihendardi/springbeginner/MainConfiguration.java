package jebihendardi.springbeginner;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import jebihendardi.springbeginner.configuration.BarConfiguration;
import jebihendardi.springbeginner.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
