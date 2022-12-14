package com.example.shedlock;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.UUID;

@SpringBootApplication
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "1M")
//@EnableSchedulerLock(defaultLockAtMostFor = "10m")
public class ShedLockApplication
//        implements CommandLineRunner
{
    Logger logger = LoggerFactory.getLogger(ShedLockApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(ShedLockApplication.class, args);
    }
    private final String id = UUID.randomUUID().toString();

    @Scheduled(cron = "*/10 * * * * *")
    @SchedulerLock(name = "runOpusCurrencyExchangeJob",lockAtLeastFor = "1M")
    public void runOpusCurrencyExchangeJob()  {
        logger.info("Scheduler id = {} ", id);
        // code block
    }
//    @Override
//    public void run(String... args) throws Exception {
//        CustomScheduler customScheduler = new CustomScheduler();
//        customScheduler.runOpusCurrencyExchangeJob();
//    }
}
