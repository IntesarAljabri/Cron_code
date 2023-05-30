package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schdule {

    @Scheduled(cron = " 0 */30 * 15,31 * * " )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
