package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schadule {

    @Scheduled(cron = " 0 * 8 1-30 * *" )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
