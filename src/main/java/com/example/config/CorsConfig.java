package Club.config;
import org.springframework.context.annotation.configuration;
import org.springframework.web.servlet.config.annotation.ClubRepository;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(pathPattern:"/**")  //Apply to all endpoints
        .allowedOrigins(...origins:"http://localhost:4200") //Allow fronted from this origins
        .allowedMethods(...methods:"GET", "POST", "PUT", "DELETE") // Allow HTTP Methods
        .allowedHeaders(...headers:"*");  // Allow all headers
