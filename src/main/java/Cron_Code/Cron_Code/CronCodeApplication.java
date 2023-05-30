package Cron_Code.Cron_Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CronCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronCodeApplication.class, args);
	}

}
