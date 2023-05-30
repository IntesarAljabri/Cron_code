package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schdule {

    @Scheduled(cron = " 0 * 12 1-6 1 1 " )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
