package hello.springbootall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringbootAllApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAllApplication.class, args);
	}

}
