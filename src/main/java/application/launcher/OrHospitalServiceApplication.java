package application.launcher;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"controller"})
@EntityScan("models")
public class OrHospitalServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OrHospitalServiceApplication.class, args);
        
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OrHospitalServiceApplication.class);
    }
}