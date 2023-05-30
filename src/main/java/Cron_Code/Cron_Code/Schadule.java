package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schadule {

    @Scheduled(cron = " 0 0 3 * 11 1-6" )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
