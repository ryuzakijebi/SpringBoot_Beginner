package jebihendardi.springbeginner;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import jebihendardi.springbeginner.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "jebihendardi.springbeginner.repository",
    "jebihendardi.springbeginner.service",
    "jebihendardi.springbeginner.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
