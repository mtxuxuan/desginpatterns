import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.xuxuan")
public class desginpatternsApplication {
    public static void main(String[] args) {

        SpringApplication.run(desginpatternsApplication.class,args);
    }

}
