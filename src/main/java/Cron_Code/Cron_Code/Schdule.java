package Cron_Code.Cron_Code;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schdule {

    @Scheduled(cron = " 0 */5 * * * 0-4 && 0 */15 * * * 5-6 " )


    public void ScheduledTask(){
        System.out.println("Hello All");

    }

}
