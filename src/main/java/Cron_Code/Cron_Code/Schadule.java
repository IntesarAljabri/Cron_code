package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schadule {

    @Scheduled(cron = " 0 * 12 1 1,4,7,10 *" )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
