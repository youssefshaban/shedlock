//package com.example.shedlock;
//
//import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.UUID;
//
//@Component
//public class CustomScheduler {
//    Logger logger = LoggerFactory.getLogger(CustomScheduler.class);
//    private final String id = UUID.randomUUID().toString();
//
//    @Scheduled(cron = "10 0 0 ? * * *")
//    @SchedulerLock(name = "runOpusCurrencyExchangeJob",lockAtLeastFor = "1M", lockAtMostFor = "30M")
//    public void runOpusCurrencyExchangeJob()  {
//        logger.info("Scheduler id = {} ", id);
//        // code block
//    }
////    @Bean
////    public CustomScheduler customScheduler (){
////        return new CustomScheduler();
////    }
//}
