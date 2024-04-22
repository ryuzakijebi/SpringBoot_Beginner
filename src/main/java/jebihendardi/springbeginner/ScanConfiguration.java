package jebihendardi.springbeginner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "jebihendardi.springbeginner.configuration"
})
public class ScanConfiguration {
}
