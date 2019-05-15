package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContestInitializer {

    public static void main(String... args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
