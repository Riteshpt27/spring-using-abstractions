package configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"proxies", "services", "repositories"})
@Configuration
public class ProjectConfiguration {
}
