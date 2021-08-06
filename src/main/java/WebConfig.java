import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc // provides the Spring Web MVC configuration such as setting up the dispatcher servlet, enabling the @Controller and the @RequestMapping  annotations and setting up other defaults
@ComponentScan(basePackages = "com.elina.controller") //configures the component scanning directive, specifying the packages to scan
public class WebConfig {
}
